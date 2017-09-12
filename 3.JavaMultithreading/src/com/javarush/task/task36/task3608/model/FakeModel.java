package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

public class FakeModel implements Model {
    ModelData modelData = new ModelData();
    @Override
    public ModelData getModelData() {
        return this.modelData;
    }

    @Override
    public void loadUsers() {
        modelData.getUsers().add(new User("Tima",1,1));
        modelData.getUsers().add(new User("Umka",2,1));
    }

    @Override
    public void loadDeletedUsers()  {
   throw new UnsupportedOperationException();
    }
}
