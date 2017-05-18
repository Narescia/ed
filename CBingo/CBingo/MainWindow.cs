using System;
using System.Diagnostics;
using Gtk;
using System.Collections.Generic;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

//		buttonGoForward.Clicked += delegate {
//
//		};

//		IList<int> list = new List<int> ();
//		list.Add (16);
//		list.Add (15);
//		list.Add (17);
//		list.Add (5);
//		list.Add (4);
//
//		foreach (int item in list)
//		Console.WriteLine ("item= " + item);

		Table table = new Table (9, 10, true);
		IList<int> bolas = new List<int> ();
		IList<Button> buttons = new List<Button> ();
		for (int numero = 1; numero <= 90; numero++) {
			bolas.Add (numero);
			uint index =(uint)numero - 1;
			Button button = new Button();
			button.Label = "" + numero;
			button.Visible = true;
			uint row = index / 10;
			uint column = index % 10;
			table.Attach (button, column, column + 1, row, row + 1);
			buttons.Add (button);
		}
		table.Visible = true;
		vBoxMain.Add (table);

		Random random = new Random ();
		buttonGoForward.Clicked += delegate {
			int randomIndex = random.Next(bolas.Count);
			int bola = bolas[randomIndex];
			Console.WriteLine ("bola =" + bola);
			bolas.RemoveAt(randomIndex);
			if (bolas.Count == 0)
				buttonGoForward.Sensitive = bolas.Count > 0;
			Process.Start("espeak", toSpeak(bola));
			buttonGoForward.ModifyBg (StateType.Normal, new Gdk.Color (0, 255, 0));
			buttons[bola - 1].ModifyBg(StateType.Normal, new Gdk.Color(255,0,0));
		};

//		for (int vez = 0; vez < int.MaxValue; vez ++) {
//			int numeroAleatorio = random.Next (1000);
//			if (numeroAleatorio < 5 || numeroAleatorio > 995)
//				Console.WriteLine ("vez=" + vez + "numeroAleatorio =" + numeroAleatorio);
//		}

	}
	private string toSpeak(int bola) {
		string text = bola.ToString ();
		if (text.Length == 2)
			text = text + " " + text [0] + " " + text [1];
		return string.Format("'{0}'", bola);
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
