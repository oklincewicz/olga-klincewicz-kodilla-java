package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given

        Item item1 = new Item(new BigDecimal(10), 5);
        Item item2 = new Item(new BigDecimal(15), 5);
        Item item3 = new Item(new BigDecimal(20), 5);

        Product product = new Product("Spoon");

        product.getItems().add(item1);
        product.getItems().add(item2);
        product.getItems().add(item3);

        Invoice invoice = new Invoice("F_12/2017");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        productDao.save(product);
        int idInvoice = invoice.getId();
        int idProduct = product.getId();

        //Then
        Assert.assertNotEquals(0, idInvoice);
        Assert.assertNotEquals(0, idProduct);

        //CleanUp

        invoiceDao.deleteAll();

    }
}
