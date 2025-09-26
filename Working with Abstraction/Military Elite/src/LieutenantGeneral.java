import java.util.List;

public interface LieutenantGeneral {
    List<Private> getPrivateList();

    void addPrivate(Private priv);

    String toString();
}
