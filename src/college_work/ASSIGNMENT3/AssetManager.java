package college_work.ASSIGNMENT3;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;

public class AssetManager<T extends Asset> {
    private HashMap<String, T> assetMap;

    public AssetManager() {
        this.assetMap = new HashMap<>();
    }

    public boolean add(T asset) {
        if (assetMap.containsKey(asset.getId())) {
            return false;
        }
        assetMap.put(asset.getId(), asset);
        return true;
    }

    public boolean remove(String id) {
        if (assetMap.containsKey(id)) {
            assetMap.remove(id);
            return true;
        }
        return false;
    }

    public boolean update(T updatedAsset) {
        if (assetMap.containsKey(updatedAsset.getId())) {
            assetMap.put(updatedAsset.getId(), updatedAsset);
            return true;
        }
        return false;
    }

    public T search(String id) {
        return assetMap.get(id);
    }

    public TreeSet<T> getSortedAssets() {
        return new TreeSet<>(assetMap.values());
    }

    public List<T> filterByName(String keyword) {
        return assetMap.values().stream()
                .filter(a -> a.getName().contains(keyword))
                .collect(Collectors.toList());
    }

    public void printAllUsingIterator() {
        ArrayList<T> list = new ArrayList<>(assetMap.values());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
