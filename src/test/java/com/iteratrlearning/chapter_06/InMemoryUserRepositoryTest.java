package com.iteratrlearning.chapter_06;

import com.iteratrlearning.chapter_06.in_memory.InMemoryUserRepository;
import org.junit.Before;

public class InMemoryUserRepositoryTest extends AbstractUserRepositoryTest
{
    private InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();

    @Override
    protected UserRepository newRepository()
    {
        return inMemoryUserRepository;
    }
}
