import java.util.ArrayList;
import java.util.List;

public class SceneManagement {
    private List<String> scenes;

    public SceneManagement() {
        scenes = new ArrayList<>();
    }

    public void addScene(String scene) {
        scenes.add(scene);
    }

    public void deleteScene(int index) {
        scenes.remove(index);
    }

    public void rearrangeScenes(int oldIndex, int newIndex) {
        String scene = scenes.remove(oldIndex);
        scenes.add(newIndex, scene);
    }
}
