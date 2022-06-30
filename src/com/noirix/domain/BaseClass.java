package com.noirix.domain;


public class BaseClass {
    private long id;

    private String name;

    public BaseClass() {
        System.out.println("In BaseClass default constructor");
    }

    public BaseClass(long id, String name) {
        System.out.println("In BaseClass constructor with params");
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseClass baseClass = (BaseClass) o;

        if (id != baseClass.id) return false;
        return name != null ? name.equals(baseClass.name) : baseClass.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
