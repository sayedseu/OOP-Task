package db;

import model.Task;

import java.util.List;

abstract class DatabaseQuery {
    abstract void insert(List<Task> tasks);
}
