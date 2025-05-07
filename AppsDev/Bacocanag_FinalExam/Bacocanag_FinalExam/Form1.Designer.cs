namespace Bacocanag_FinalExam
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            dataGridView1 = new DataGridView();
            addButton = new Button();
            label1 = new Label();
            productIdTextBox = new TextBox();
            label2 = new Label();
            nameTextBox = new TextBox();
            label3 = new Label();
            priceTextBox = new TextBox();
            label4 = new Label();
            quantityTextBox = new TextBox();
            viewButton = new Button();
            deleteButton = new Button();
            updateButton = new Button();
            ProductID = new DataGridViewTextBoxColumn();
            ProductName = new DataGridViewTextBoxColumn();
            Price = new DataGridViewTextBoxColumn();
            Quantity = new DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)dataGridView1).BeginInit();
            SuspendLayout();
            // 
            // dataGridView1
            // 
            dataGridView1.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            dataGridView1.Columns.AddRange(new DataGridViewColumn[] { ProductID, ProductName, Price, Quantity });
            dataGridView1.Location = new Point(314, 29);
            dataGridView1.Name = "dataGridView1";
            dataGridView1.Size = new Size(439, 321);
            dataGridView1.TabIndex = 0;
            dataGridView1.CellContentClick += dataGridView1_CellContentClick;
            // 
            // addButton
            // 
            addButton.Location = new Point(12, 208);
            addButton.Name = "addButton";
            addButton.Size = new Size(101, 50);
            addButton.TabIndex = 1;
            addButton.Text = "Add";
            addButton.UseVisualStyleBackColor = true;
            addButton.Click += addButton_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(34, 32);
            label1.Name = "label1";
            label1.Size = new Size(69, 17);
            label1.TabIndex = 2;
            label1.Text = "Product ID";
            // 
            // productIdTextBox
            // 
            productIdTextBox.Location = new Point(109, 29);
            productIdTextBox.Name = "productIdTextBox";
            productIdTextBox.Size = new Size(100, 25);
            productIdTextBox.TabIndex = 3;
            productIdTextBox.TextChanged += productIdTextBox_TextChanged;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(34, 70);
            label2.Name = "label2";
            label2.Size = new Size(43, 17);
            label2.TabIndex = 4;
            label2.Text = "Name";
            // 
            // nameTextBox
            // 
            nameTextBox.Location = new Point(109, 67);
            nameTextBox.Name = "nameTextBox";
            nameTextBox.Size = new Size(100, 25);
            nameTextBox.TabIndex = 5;
            nameTextBox.TextChanged += nameTextBox_TextChanged;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(34, 107);
            label3.Name = "label3";
            label3.Size = new Size(36, 17);
            label3.TabIndex = 6;
            label3.Text = "Price";
            // 
            // priceTextBox
            // 
            priceTextBox.Location = new Point(109, 107);
            priceTextBox.Name = "priceTextBox";
            priceTextBox.Size = new Size(100, 25);
            priceTextBox.TabIndex = 7;
            priceTextBox.TextChanged += priceTextBox_TextChanged;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(34, 148);
            label4.Name = "label4";
            label4.Size = new Size(56, 17);
            label4.TabIndex = 8;
            label4.Text = "Quantity";
            // 
            // quantityTextBox
            // 
            quantityTextBox.Location = new Point(109, 148);
            quantityTextBox.Name = "quantityTextBox";
            quantityTextBox.Size = new Size(100, 25);
            quantityTextBox.TabIndex = 9;
            quantityTextBox.TextChanged += quantityTextBox_TextChanged;
            // 
            // viewButton
            // 
            viewButton.Location = new Point(12, 278);
            viewButton.Name = "viewButton";
            viewButton.Size = new Size(101, 51);
            viewButton.TabIndex = 10;
            viewButton.Text = "View";
            viewButton.UseVisualStyleBackColor = true;
            viewButton.Click += viewButton_Click;
            // 
            // deleteButton
            // 
            deleteButton.Location = new Point(145, 208);
            deleteButton.Name = "deleteButton";
            deleteButton.Size = new Size(101, 50);
            deleteButton.TabIndex = 11;
            deleteButton.Text = "Delete";
            deleteButton.UseVisualStyleBackColor = true;
            deleteButton.Click += button1_Click;
            // 
            // updateButton
            // 
            updateButton.Location = new Point(145, 278);
            updateButton.Name = "updateButton";
            updateButton.Size = new Size(101, 51);
            updateButton.TabIndex = 12;
            updateButton.Text = "Update";
            updateButton.UseVisualStyleBackColor = true;
            updateButton.Click += updateButton_Click;
            // 
            // ProductID
            // 
            ProductID.DataPropertyName = "ProductID";
            ProductID.HeaderText = "Product ID";
            ProductID.Name = "ProductID";
            // 
            // ProductName
            // 
            ProductName.DataPropertyName = "ProductName";
            ProductName.HeaderText = "Name";
            ProductName.Name = "ProductName";
            // 
            // Price
            // 
            Price.DataPropertyName = "Price";
            Price.HeaderText = "Price";
            Price.Name = "Price";
            // 
            // Quantity
            // 
            Quantity.DataPropertyName = "Quantity";
            Quantity.HeaderText = "Quantity";
            Quantity.Name = "Quantity";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 17F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(766, 368);
            Controls.Add(updateButton);
            Controls.Add(deleteButton);
            Controls.Add(viewButton);
            Controls.Add(quantityTextBox);
            Controls.Add(label4);
            Controls.Add(priceTextBox);
            Controls.Add(label3);
            Controls.Add(nameTextBox);
            Controls.Add(label2);
            Controls.Add(productIdTextBox);
            Controls.Add(label1);
            Controls.Add(addButton);
            Controls.Add(dataGridView1);
            Name = "Form1";
            Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)dataGridView1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private DataGridView dataGridView1;
        private Button addButton;
        private Label label1;
        private TextBox productIdTextBox;
        private Label label2;
        private TextBox nameTextBox;
        private Label label3;
        private TextBox priceTextBox;
        private Label label4;
        private TextBox quantityTextBox;
        private Button viewButton;
        private Button deleteButton;
        private Button updateButton;
        private DataGridViewTextBoxColumn ProductID;
        private DataGridViewTextBoxColumn ProductName;
        private DataGridViewTextBoxColumn Price;
        private DataGridViewTextBoxColumn Quantity;
    }
}
