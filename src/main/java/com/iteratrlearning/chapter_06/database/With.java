package com.iteratrlearning.chapter_06.database;

import java.sql.SQLException;

interface With<P> {
    void run(P stmt) throws SQLException;
}
