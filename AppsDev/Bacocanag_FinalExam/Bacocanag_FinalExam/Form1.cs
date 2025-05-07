using System.Data;
using System.Data.SqlClient;
using Microsoft.Data.SqlClient;
using Microsoft.IdentityModel.Tokens;

namespace Bacocanag_FinalExam
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        string connectionToDataBase = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\Toshiba\OneDrive\Documents\RetailStoreDB.mdf;Integrated Security=True;Connect Timeout=30;Encrypt=True";
        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void displayButton_Click(object sender, EventArgs e)
        {

        }
        private void clear()
        {
            // Temporarily unsubscribe event handlers
            productIdTextBox.TextChanged -= productIdTextBox_TextChanged;
            nameTextBox.TextChanged -= nameTextBox_TextChanged;
            priceTextBox.TextChanged -= priceTextBox_TextChanged;
            quantityTextBox.TextChanged -= quantityTextBox_TextChanged;

            // Clear the text boxes
            productIdTextBox.Clear();
            nameTextBox.Clear();
            priceTextBox.Clear();
            quantityTextBox.Clear();

            // Resubscribe event handlers
            productIdTextBox.TextChanged += productIdTextBox_TextChanged;
            nameTextBox.TextChanged += nameTextBox_TextChanged;
            priceTextBox.TextChanged += priceTextBox_TextChanged;
            quantityTextBox.TextChanged += quantityTextBox_TextChanged;
        }
        private bool ValidateInputs(out int productId, out string name, out decimal price, out int quantity)
        {
            productId = 0;
            name = nameTextBox.Text;
            price = 0;
            quantity = 0;

            if (!int.TryParse(productIdTextBox.Text, out productId))
            {
                MessageBox.Show("Product ID must be a number!");
                return false;
            }

            if (string.IsNullOrWhiteSpace(name))
            {
                MessageBox.Show("Product name cannot be empty!");
                return false;
            }

            if (!decimal.TryParse(priceTextBox.Text, out price))
            {
                MessageBox.Show("Price must be a valid decimal number!");
                return false;
            }

            if (!int.TryParse(quantityTextBox.Text, out quantity))
            {
                MessageBox.Show("Quantity must be a number!");
                return false;
            }

            return true;
        }

        private void addButton_Click(object sender, EventArgs e)
        {

            if (!ValidateInputs(out int productId, out string name, out decimal price, out int quantity))
            {
                return;
            }
            //===================================================================Insert===============================================================================
            try
            {
                using (var connection = new SqlConnection(connectionToDataBase))
                {
                    connection.Open();

                    // Check if the product already exists
                    string checkSqlDataBase = "SELECT COUNT(*) FROM Products WHERE ProductID = @ProductID";
                    using (var command = new SqlCommand(checkSqlDataBase, connection))
                    {
                        command.Parameters.Add(new SqlParameter("@ProductID", SqlDbType.Int) { Value = productId });
                        int existingProduct = (int)command.ExecuteScalar();

                        if (existingProduct > 0)
                        {
                            MessageBox.Show("Product already exists!");
                            return;
                        }
                    }

                    // Insert new product
                    string insertSqlCommand = "INSERT INTO Products (ProductID, ProductName, Price, Quantity) VALUES (@ProductID, @ProductName, @Price, @Quantity)";
                    using (var command = new SqlCommand(insertSqlCommand, connection))
                    {
                        command.Parameters.Add(new SqlParameter("@ProductID", SqlDbType.Int) { Value = productId });
                        command.Parameters.Add(new SqlParameter("@ProductName", SqlDbType.NVarChar, 50) { Value = name });
                        command.Parameters.Add(new SqlParameter("@Price", SqlDbType.Decimal) { Value = price });
                        command.Parameters.Add(new SqlParameter("@Quantity", SqlDbType.Int) { Value = quantity });

                        command.ExecuteNonQuery();
                    }

                    // Refresh the DataGridView
                    RefreshDataGrid(connection);
                }
                clear();
                MessageBox.Show("Product added successfully!");
            }
            catch (Exception ex)
            {
                MessageBox.Show($"An error occurred: {ex.Message}");
            }
            //============================================================End of Insert===============================================================================

        }
        
        private void RefreshDataGrid(SqlConnection connection)
        {
            string query = "SELECT * FROM Products";
            using (var adapter = new SqlDataAdapter(query, connection))
            {
                var table = new DataTable();
                adapter.Fill(table);
                dataGridView1.DataSource = table;
            }
        }
        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void productIdTextBox_TextChanged(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(productIdTextBox.Text))
            {
                MessageBox.Show("This can't be Empty!");
            }
        }

        private void nameTextBox_TextChanged(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(nameTextBox.Text))
            {
                MessageBox.Show("This can't be Empty!");
            }
        }

        private void priceTextBox_TextChanged(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(priceTextBox.Text))
            {
                MessageBox.Show("This can't be Empty!");
            }
        }

        private void quantityTextBox_TextChanged(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(quantityTextBox.Text))
            {
                MessageBox.Show("This can't be Empty!");
            }
        }

        private void viewButton_Click(object sender, EventArgs e)
        {
 //=============================================View===============================================================================
            using (var connection = new SqlConnection(connectionToDataBase))
            {
                var tableData = new SqlDataAdapter("SELECT * FROM Products", connection);
                var table = new DataTable();
                tableData.Fill(table);

                dataGridView1.DataSource = table; // Displays Data to the grid

            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int productID = int.Parse(productIdTextBox.Text);
            //=============================================Delete===============================================================================
            string deleteSqlCommand = "DELETE FROM Products WHERE ProductID = @ProductID";
            using (var connection = new SqlConnection(connectionToDataBase))
            {
                connection.Open(); // Opens the connection to the database
                using (var command = new SqlCommand(deleteSqlCommand, connection))
                {
                    command.Parameters.Add(new SqlParameter("@ProductID", SqlDbType.Int) { Value = productID });
                    command.ExecuteNonQuery();
                    clear();
                }
            }
        }

        private void updateButton_Click(object sender, EventArgs e)
        {
            if (!ValidateInputs(out int productId, out string name, out decimal price, out int quantity))
            {
                return;
            }
            string updateSqlCommand = "UPDATE Products SET ProductName = @ProductName, Price = @Price, Quantity = @Quantity WHERE ProductID = @ProductID";
            using (var connect = new SqlConnection(connectionToDataBase))
            {
                connect.Open();
                using (var command = new SqlCommand(updateSqlCommand, connect))
                {

                    command.Parameters.Add(new SqlParameter("@ProductID", SqlDbType.Int) { Value = productId });
                    command.Parameters.Add(new SqlParameter("@ProductName", SqlDbType.NVarChar, 50) { Value = name });
                    command.Parameters.Add(new SqlParameter("@Price", SqlDbType.Decimal) { Value = price });
                    command.Parameters.Add(new SqlParameter("@Quantity", SqlDbType.Int) { Value = quantity });

                    command.ExecuteNonQuery();
                    clear();
                }
            }
        }
    }
}

