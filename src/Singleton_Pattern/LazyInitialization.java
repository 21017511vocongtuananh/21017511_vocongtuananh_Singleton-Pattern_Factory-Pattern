package Singleton_Pattern;

public class LazyInitialization {
    private static LazyInitialization instance;

    // Private constructor để ngăn chặn việc tạo instance từ bên ngoài
    private LazyInitialization() {}

    // Phương thức public để lấy instance duy nhất (lazy initialization)
    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
