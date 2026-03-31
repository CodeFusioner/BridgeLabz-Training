package Junit.src.main.java;

/*
5️⃣ Database Connection Lifecycle
*/
public class DatabaseConnection {
    public boolean connected;

    public void connect() { connected = true; }
    public void disconnect() { connected = false; }
}
