package com.iteratrlearning.chapter_06;

import com.iteratrlearning.chapter_06.database.DatabaseTwootRepository;
import org.junit.Before;

import java.io.IOException;

public class DatabaseTwootRepositoryTest extends AbstractTwootRepositoryTest
{
    @Before
    public void setUp() throws IOException
    {
        repository = new DatabaseTwootRepository();

    }
}
