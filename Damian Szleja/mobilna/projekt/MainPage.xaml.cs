namespace Rejestracja;

public partial class MainPage : ContentPage
{
    public MainPage()
    {
        InitializeComponent();
    }

    private void Zatwierdz(object sender, EventArgs e)
    {
        string email = Email.Text ?? "";
        string haslo = Haslo.Text ?? "";
        string powtorzone = PowtorzoneHaslo.Text ?? "";
        if (!email.Contains("@"))
        {
            Komunikat.Text = "Nieprawidłowy adres e-mail";
        }
        else if (haslo != powtorzone)
        {
            Komunikat.Text = "Hasła się różnią";
        }
        else
        {
            Komunikat.Text = "Witaj " + email;
        }
    }
}
