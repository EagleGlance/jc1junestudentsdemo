package com.noirix.domain;


/*Type K - future type of key of object*/
/*Type V - future type of value of object*/
public class Template<K extends Number, V extends BaseClass> {
    K key;
    V value;

    public Template() {
    }

    public Template(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Template<?, ?> template = (Template<?, ?>) o;

        if (key != null ? !key.equals(template.key) : template.key != null) return false;
        return value != null ? value.equals(template.value) : template.value == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
