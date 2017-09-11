package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User melania = new Millenials("Melania");
        User norbert = new YGeneration("Norbert");
        User ola = new ZGeneration("Ola");

        //When
        System.out.println("Started testDefaultSharingStrategies........");
        String olaUse = ola.predict();
        System.out.printf("Ola " + olaUse);
        String norbertUse = norbert.predict();
        System.out.println(" Norbert " + norbertUse);
        String melaniaUse = melania.predict();
        System.out.println("Melania " + melaniaUse);
        System.out.println("Ended testDefaultSharingStrategies........");

        //Then
        Assert.assertEquals("use Facebook", olaUse);
        Assert.assertEquals("use Twitter", norbertUse);
        Assert.assertEquals("use Snapchat", melaniaUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User melania = new Millenials("Melania");
        User norbert = new YGeneration("Norbert");
        User ola = new ZGeneration("Ola");

        //When
        System.out.println("Started testIndividualSharingStrategy........");
        String olaUse = ola.predict();
        System.out.printf("Ola " + olaUse);
        ola.sharePost(new TwitterPublisher());
        olaUse = ola.predict();
        System.out.printf(" Ola must " + olaUse);
        String norbertUse = norbert.predict();
        System.out.println(" Norbert " + norbertUse);
        String melaniaUse = melania.predict();
        System.out.println("Melania " + melaniaUse);
        System.out.println(" Ended testIndividualSharingStrategy........");

        //Then
        Assert.assertEquals("use Twetter", olaUse);
    }
}
