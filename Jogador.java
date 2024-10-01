public class Jogador {
    private int Pin;
    private String Nome;
    private String Email;

    public Jogador(int Pin, String Nome, String Email) {
        this.Pin = Pin;
        this.Nome = Nome;
        this.Email = Email;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int pin) {
        Pin = pin;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
