package com.codecool;

import java.util.List;

public class Board {
    private int BoardId;

    private List<Task> taskList;

    public Board(int boardId) {
        this.BoardId = boardId;
    }

    public int getBoardId() {
        return BoardId;
    }

    public void setBoardId(int boardId) {
        BoardId = boardId;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
