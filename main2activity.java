package subtrator.app.android;


import android.app.*;
import android.os.*;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.KeyEvent.Callback;
import 	android.view.InputEvent;
import	android.view.KeyEvent;
import android.view.MenuInflater;
import 	android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;

import android.content.Context;


import android.app.Activity;
import android.os.Bundle;




import android.os.Environment;
import android.util.Log;
import android.widget.TextView;
import java.io.File;



import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;



import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.lang.Object;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.text.TextUtils;

import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;
import java.lang.Exception;
import java.io.IOException;
import android.webkit.WebView;
import android.view.KeyEvent.Callback;
import java.lang.Object;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import android.view.MenuItem;
import android.widget.Toast; 
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import 	android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import android.app.ListActivity;
import java.io.*;


import 	java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
import android.util.Base64;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;







public class main2activity extends Activity 
{
	int nn;

	SQLiteDatabase db;
	Cursor cursor;
	private Button btn;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;

	private int iii;

	private Context context;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adicionar);
		iii=Integer.parseInt( System.getProperty("subtrators.app.android.keys") );
		//setTitle();
		context=this;

		btn = (Button) findViewById(R.id.add); 	
		btn1 = (Button) findViewById(R.id.cancelar); 	
		btn2 = (Button) findViewById(R.id.modificar); 	
		btn3 = (Button) findViewById(R.id.limpar); 	
		btn4 = (Button) findViewById(R.id.apagar); 	
		btn5 = (Button) findViewById(R.id.zero); 

		final EditText ED = (EditText)findViewById(R.id.edata);

		final EditText ED2 = (EditText)findViewById(R.id.enome);
		final EditText ED3 = (EditText)findViewById(R.id.evalor);


		btn.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("adicionar");

					File f2=new File("/sdcard/app.android/subtrators.app.android/subtrators.data");
					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);

					String s="INSERT INTO subtrators (datas,nome,valor) VALUES (\""+ED.getText()+"\",\""+ED2.getText()+"\",\""+ED3.getText()+"\")";
					setTitle(s);
					db.execSQL(s);

					db.close();


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  


					finish(); 


				}});

		btn1.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("cancelar");


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  



					finish(); 





				}});



		btn2.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("modificar");

					File f2=new File("/sdcard/app.android/subtrators.app.android/subtrators.data");
					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);
					db.delete("subtrators","Id<0",null);
					db.delete("subtrators","Id="+Integer.toString(iii),null);
					String s="INSERT INTO subtrators (datas,nome,valor) VALUES (\""+ED.getText()+"\",\""+ED2.getText()+"\",\""+ED3.getText()+"\")";
					setTitle(s);
					db.execSQL(s);
					db.delete("subtrators","Id<0",null);
					db.close();


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  


					finish(); 


				}});

		btn3.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("adicionar");

					iii=-1;
					ED.setText("");

					ED2.setText("");
					ED3.setText("");


				}});



		btn4.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("apagar");

					File f2=new File("/sdcard/app.android/subtrators.app.android/subtrators.data");
					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);
					db.delete("subtrators","Id<0",null);
					db.delete("subtrators","Id="+Integer.toString(iii),null);

					db.delete("subtrators","Id<0",null);
					db.close();


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  


					finish(); 


				}});



		btn5.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("0");
					try{
						File f2=new File("/sdcard/app.android/subtrators.app.android/subtrators.data");
						db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);
						db.delete("subtrators","Id<>0",null);
						db.delete("subtrators","Id<1",null);

					}catch(Exception e){

						setTitle(e.toString());
					}


					db.close();

					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  


					finish(); 


				}});



		if(iii==-1) setTitle("adicionar");
		ED.setText(System.getProperty("subtrators.app.android.data"));

		ED2.setText(System.getProperty("subtrators.app.android.nome"));
		ED3.setText(System.getProperty("subtrators.app.android.valor"));


	}


}




