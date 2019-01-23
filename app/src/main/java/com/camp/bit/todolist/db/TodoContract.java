package com.camp.bit.todolist.db;

import android.provider.BaseColumns;

import static com.camp.bit.todolist.db.TodoContract.TodoEntry.COLUMN_PRIMARY;
import static com.camp.bit.todolist.db.TodoContract.TodoEntry.TABLE_NAME;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    private TodoContract() {

    }
    public static class TodoEntry implements BaseColumns{
        public static final String TABLE_NAME="todo";
        public static final String COLUMN_CONTENT="content";
        public static final String COLUMN_DATE= "date";
        public static final String COLUMN_SDATE= "state";
        public static final String COLUMN_PRIMARY= "primary";

    }

    public static String getSqlCreateEntries() {
        return SQL_CREATE_ENTRIES;
    }

    public static  final String SQL_ADD_PRIMARY_COLLUMN = "ALTER TABLE "+TABLE_NAME+" ADD "+COLUMN_PRIMARY;

    public static String getSqlDeleteEntries() {
        return SQL_DELETE_ENTRIES;
    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    TodoEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    TodoEntry.COLUMN_CONTENT + " TEXT," +TodoEntry.COLUMN_DATE + " INTEGER,"+COLUMN_PRIMARY + " INTEGER,"+
                    TodoEntry.COLUMN_SDATE +  " INTEGER)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TABLE_NAME;

}
