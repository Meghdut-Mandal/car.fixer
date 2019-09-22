package com.android.devs.car;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class Deatail extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ModelDetail> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatail);
        recyclerView = findViewById(R.id.detailRecycler);

        arrayList = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        arrayList.add(new ModelDetail(R.drawable.step1,"How to Change a Car Battery","1\n" +
                "Park on a level surface in a secure area and turn off your vehicle. Avoid changing your battery on the side of the road when at all possible. Find a safe place to work that’s well away from traffic, sparks, open flames, or water. Engage your parking brake and turn your vehicle off. Remove the keys from the ignition to ensure no power is going to the battery.[1]\n" +
                "A garage or driveway is a good place to change your battery. Just make sure the area is well-ventilated (i.e. keep the garage door open)."));
        arrayList.add(new ModelDetail(R.drawable.step2,"Put on safety gear and pop your hood","Batteries contain a sulfuric acid electrolyte solution, which is highly corrosive, can burn your skin, and produces flammable hydrogen gas. Put on insulated work gloves and safety goggles to protect yourself. Then, open your hood and prop it up with a rod, if necessary.[2]\n" +
                "Take off any metal jewelry you’re wearing, like a watch or ring, to protect yourself from electric shock.\n" +
                "Wear old clothes that you don’t mind getting greasy."));
        arrayList.add(new ModelDetail(R.drawable.step3,"\n" +
                "Locate the battery."," Look for the battery in one corner of the engine bay, either near the windshield or the front bumper on either side of the car. Find the rectangular battery box which has 2 cables attached to it. If you have a newer car, the battery might be underneath a plastic cover, so remove the cover if necessary.[3]\n" +
                "Refer to your owner’s manual if you aren’t able to find the battery.\n" +
                "Note that on some vehicles, the battery is located in the trunk rather than under the hood."));
        arrayList.add(new ModelDetail(R.drawable.step4,"\n" +
                "Disconnect the negative cable first and secure it with a cable tie.","Always remove the negative cable before the positive cable to prevent electrical shorts. The negative battery terminal is usually black and may have a minus sign (-) near it. Remove the plastic cover, if applicable, then loosen the negative cable clamp with a wrench and slide the cable off the terminal.[4]\n" +
                "Use a cable tie to secure the negative cable to the engine bay, making sure it doesn’t come into contact with anything metal.\n" +
                "Depending on the vehicle, you may need a 7-mm, 8-mm, 10-mm, or 13-mm wrench to remove the cables. However, if your battery terminals have quick-release clamps, you won’t need any tools to remove the cables."));
        arrayList.add(new ModelDetail(R.drawable.step5,"\n" +
                "Disconnect the positive cable next and secure it with a cable tie.","he positive terminal is typically red and might be marked with a plus sign (+). Remove the plastic cover over the terminal, if your vehicle has one, then use a wrench to loosen the positive cable clamp and take the cable off of the terminal. Secure the cable to the engine bay with a cable clamp"));
        arrayList.add(new ModelDetail(R.drawable.step6,"\n" +
                "Remove the battery from the vehicle","Inspect the bracket that secures the battery in place and remove any connectors that hold the battery to the bracket. You may need a socket wrench, the right-size socket, and an extension bar. Once you’ve removed all the fasteners, lift the battery out of the engine bay and set it aside on a concrete surface, if possible.[6]\n" +
                "The battery may weigh more than 20 pounds (9.1 kg), so ask a friend for help if you can't lift it yourself."));


        DetailAdapter imagesAdapter = new DetailAdapter(arrayList,this);
        recyclerView.setAdapter(imagesAdapter);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(this,SelectRepair.class);
        startActivity(i);
        finish();
    }
}
