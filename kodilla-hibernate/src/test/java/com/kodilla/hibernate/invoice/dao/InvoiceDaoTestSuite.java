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
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;
//    @Autowired
//    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given

        Item item1 = new Item(new BigDecimal("10"), 2, new BigDecimal("20"));
        Item item2 = new Item(new BigDecimal("15"), 2, new BigDecimal("30"));
        Item item3 = new Item(new BigDecimal("20"), 2, new BigDecimal("40"));

        Product product = new Product("Spoon");

        item1.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);

        Invoice invoice = new Invoice("F_12/2017");

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        productDao.save(product);
        invoiceDao.save(invoice);
        int idProduct = product.getId();
        int idInvoice = invoice.getId();

//        //Then
      Assert.assertNotEquals(0, idProduct);
      Assert.assertNotEquals(0, idInvoice);
      Assert.assertEquals(3,invoice.getItems().size());


        //CleanUp

        productDao.deleteAll();
        invoiceDao.deleteAll();


    }
}
