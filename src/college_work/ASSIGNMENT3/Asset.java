package college_work.ASSIGNMENT3;

import java.util.HashSet;

public abstract class Asset implements Comparable<Asset> {
    private String id;
    private String name;
    private HashSet<String> tags;

    public Asset(String id, String name) {
        this.id = id;
        this.name = name;
        this.tags = new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<String> getTags() {
        return tags;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTag(String tag) {
        this.tags.add(tag);
    }

    @Override
    public int compareTo(Asset other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Tags: " + tags;
    }
}