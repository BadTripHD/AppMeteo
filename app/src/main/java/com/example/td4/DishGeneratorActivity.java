package com.example.td4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DishGeneratorActivity extends AppCompatActivity {

    private CheckBox entrée, plat, désert;
    private Spinner spinnerSaison;
    private ArrayList<Saison> SaisonList;
    private Button btnValid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_dish_generator);

        initializeUI();

        final Prevision p1 = (Prevision) getIntent().getSerializableExtra("info");

        SaisonList = new ArrayList<>();
        final ArrayAdapter<Saison> adapter = new ArrayAdapter<Saison>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,SaisonList);
        spinnerSaison.setAdapter(adapter);

        Saison s1 = new Saison("Printemps");
        Saison s2 = new Saison("Été");
        Saison s3 = new Saison("Automne");
        Saison s4 = new Saison("Hiver");

        SaisonList.add(s1);
        SaisonList.add(s2);
        SaisonList.add(s3);
        SaisonList.add(s4);

        adapter.notifyDataSetChanged();


        btnValid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if((entrée.isChecked() != false && plat.isChecked() == false && désert.isChecked() == false && spinnerSaison.getSelectedItem() != null) || (entrée.isChecked() == false && plat.isChecked() != false && désert.isChecked() == false && spinnerSaison.getSelectedItem() != null) || (entrée.isChecked() == false && plat.isChecked() == false && désert.isChecked() != false && spinnerSaison.getSelectedItem() != null)) {

                    switch (p1.getWeather().get(0).getMain()) {
                        case "Rain":
                            if(entrée.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Asperges-a-la-grenobloise-3089332");
                                        break;
                                    case "Été":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Tapenade-verte-2079518");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/chou-fleur-mimosa-550915");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Soupe-patates-douces-poireaux-et-coco-3407231");
                                        break;
                                }
                            } else if(plat.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Gratin-de-legumes-verts-2687757");
                                        break;
                                    case "Été":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Gaufres-a-la-courgette-3408239");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Tagine-d-agneau-1356207");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Potee-finisterienne-3781254");
                                        break;
                                }
                            } else {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://www.cuisineaz.com/recettes/creme-de-mangue-84103.aspx");
                                        break;
                                    case "Été":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/mousse-de-framboises-200119-163560");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Poires-en-croute-sucree-2976301");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://www.cuisineaz.com/recettes/tiramisu-a-la-mangue-et-aux-speculoos-84156.aspx");
                                        break;
                                }
                            }
                            break;

                        case "Clouds":
                            if(entrée.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Petits-artichauts-violets-a-l-italienne-2077962");
                                        break;
                                    case "Été":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Rillettes-de-thon-a-la-ricotta-2742354");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Veloute-de-butternut-aux-chataignes-2035722");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Soupe-aux-5-legumes-2064760");
                                        break;
                                }
                            } else if(plat.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Epaule-d-agneau-entiere-rotie-au-four-859952");
                                        break;
                                    case "Été":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Shakshuka-aux-oeufs-et-tomates-3131122");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Potiron-au-four-2034950");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Mac-and-cheese-au-cheddar-2877814");
                                        break;
                                }
                            } else {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://www.cuisineaz.com/recettes/creme-de-mangue-84103.aspx");
                                        break;
                                    case "Été":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Sorbet-pomme-Thermomix-2713634");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Gateau-aux-pommes-facile-3010459");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Compote-de-mangues-des-6-mois-1291863");
                                        break;
                                }
                            }
                            break;

                        case "Thunderstorm":
                            if(entrée.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/creme-dasperge-verte-glacee-chantilly-comte-020414-847862");
                                        break;
                                    case "Été":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/carpaccio-melon-parme-070717-133201");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/tartine-de-reblochon-champignons-271011-197963");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/huitres-crues-sublimees-111214-93367");
                                        break;
                                }
                            } else if(plat.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/spaghettis-de-legumes-a-la-bolognaise-050118-146265");
                                        break;
                                    case "Été":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/panna-cotta-aux-fruits-rouges-130815-97761");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Gnocchis-au-potimarron-sauce-Saint-Nectaire-2622724");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/clafoutis-aux-poireaux-saumon-fume-et-au-gruyere-aop-suisse-061118-151645");
                                        break;
                                }
                            } else {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://www.cuisineaz.com/recettes/muffins-orange-citron-86064.aspx");
                                        break;
                                    case "Été":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Sorbet-pomme-Thermomix-2713634");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.cuisineaz.com/recettes/brownies-d-automne-aux-noix-30408.aspx");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/buche-de-noel-a-la-framboise-et-ganache-chocolat-211118-151878");
                                        break;
                                }
                            }
                            break;

                        case "Drizzle":
                            if(entrée.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/creme-dasperge-verte-glacee-chantilly-comte-020414-847862");
                                        break;
                                    case "Été":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/carpaccio-melon-parme-070717-133201");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/tartine-de-reblochon-champignons-271011-197963");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/huitres-crues-sublimees-111214-93367");
                                        break;
                                }
                            } else if(plat.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/spaghettis-de-legumes-a-la-bolognaise-050118-146265");
                                        break;
                                    case "Été":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/panna-cotta-aux-fruits-rouges-130815-97761");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Gnocchis-au-potimarron-sauce-Saint-Nectaire-2622724");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/clafoutis-aux-poireaux-saumon-fume-et-au-gruyere-aop-suisse-061118-151645");
                                        break;
                                }
                            } else {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://www.cuisineaz.com/recettes/muffins-orange-citron-86064.aspx");
                                        break;
                                    case "Été":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Sorbet-pomme-Thermomix-2713634");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.cuisineaz.com/recettes/brownies-d-automne-aux-noix-30408.aspx");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/buche-de-noel-a-la-framboise-et-ganache-chocolat-211118-151878");
                                        break;
                                }
                            }
                            break;

                        case "Snow":
                            if(entrée.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/creme-dasperge-verte-glacee-chantilly-comte-020414-847862");
                                        break;
                                    case "Été":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/carpaccio-melon-parme-070717-133201");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/tartine-de-reblochon-champignons-271011-197963");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/huitres-crues-sublimees-111214-93367");
                                        break;
                                }
                            } else if(plat.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/spaghettis-de-legumes-a-la-bolognaise-050118-146265");
                                        break;
                                    case "Été":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/panna-cotta-aux-fruits-rouges-130815-97761");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Gnocchis-au-potimarron-sauce-Saint-Nectaire-2622724");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/clafoutis-aux-poireaux-saumon-fume-et-au-gruyere-aop-suisse-061118-151645");
                                        break;
                                }
                            } else {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://www.cuisineaz.com/recettes/muffins-orange-citron-86064.aspx");
                                        break;
                                    case "Été":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Sorbet-pomme-Thermomix-2713634");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.cuisineaz.com/recettes/brownies-d-automne-aux-noix-30408.aspx");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/buche-de-noel-a-la-framboise-et-ganache-chocolat-211118-151878");
                                        break;
                                }
                            }
                            break;

                        default:
                            if(entrée.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/creme-dasperge-verte-glacee-chantilly-comte-020414-847862");
                                        break;
                                    case "Été":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/carpaccio-melon-parme-070717-133201");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/tartine-de-reblochon-champignons-271011-197963");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/huitres-crues-sublimees-111214-93367");
                                        break;
                                }
                            } else if(plat.isChecked() != false) {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/spaghettis-de-legumes-a-la-bolognaise-050118-146265");
                                        break;
                                    case "Été":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/panna-cotta-aux-fruits-rouges-130815-97761");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Gnocchis-au-potimarron-sauce-Saint-Nectaire-2622724");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/clafoutis-aux-poireaux-saumon-fume-et-au-gruyere-aop-suisse-061118-151645");
                                        break;
                                }
                            } else {
                                switch (spinnerSaison.getSelectedItem().toString()) {
                                    case "Printemps":
                                        intentLaucher("https://www.cuisineaz.com/recettes/muffins-orange-citron-86064.aspx");
                                        break;
                                    case "Été":
                                        intentLaucher("https://www.elle.fr/Elle-a-Table/Recettes-de-cuisine/Sorbet-pomme-Thermomix-2713634");
                                        break;
                                    case "Automne":
                                        intentLaucher("https://www.cuisineaz.com/recettes/brownies-d-automne-aux-noix-30408.aspx");
                                        break;
                                    case "Hiver":
                                        intentLaucher("https://madame.lefigaro.fr/recettes/buche-de-noel-a-la-framboise-et-ganache-chocolat-211118-151878");
                                        break;
                                }
                            }

                    }


                } else {
                    Toast.makeText(DishGeneratorActivity.this, "Veuillez remplir cocher une seule case et selection une saison", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void initializeUI(){

        entrée = findViewById(R.id.idCheckBoxEntrée);
        plat = findViewById(R.id.idCheckBoxPlat);
        désert = findViewById(R.id.idCheckBoxDésert);
        spinnerSaison = findViewById(R.id.idSpinner);
        btnValid = findViewById(R.id.idBtnPlat);
    }

    private void intentLaucher(String lien) {
        Uri uri = Uri.parse(lien);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
