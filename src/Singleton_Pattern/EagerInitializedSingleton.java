package Singleton_Pattern;

public class EagerInitializedSingleton {
	 // Khai báo một instance duy nhất
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // Private constructor để ngăn không cho tạo instance từ bên ngoài
    private EagerInitializedSingleton() {}

    // Phương thức public để lấy instance duy nhất
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
