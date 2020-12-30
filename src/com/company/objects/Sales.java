package com.company.objects;

public class Sales {
    private int id;
    private String product;
    private int quantity;
    private String dateOfSale;
    private int clientId;
    private String employeeName;

    public Sales(){}

        public Sales(int id, String product, int quantity,String dateOfSale, int clientId){
        setId(id);
        setProduct(product);
        setQuantity(quantity);
        setEmployeeName(employeeName);
        setDateOfSale(dateOfSale);
        setClientId(clientId);
        }

    public void setId(int id) {
        this.id = id;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setDateOfSale(String dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public String getProduct() {
        return product;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "" +
                "Sale ID: " + id +
                ", '" + product + '\'' +
                ", Quantity: " + quantity +
                ", Date: '" + dateOfSale + '\'' +
                '|';
    }
}
