package nears.ashik.ndk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0); //Checks if FB is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://page/376227335860239")); //Trys to make intent with FB's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/karthikofficialpage")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenTwitterIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.twitter.android", 0); //Checks if Twitter is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/drkarthiik")); //Trys to make intent with Twitter's's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/drkarthiik")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenLinkdinIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.linkedin.android", 0); //Checks if Linkdin is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/karthikm128")); //Trys to make intent with Linkdin's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/karthikm128")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenGPlusIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.google.android.apps.plus", 0); //Checks if G+ is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://plus.google.com/u/0/+KarthikM128")); //Trys to make intent with G+'s URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://plus.google.com/u/0/+KarthikM128")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenInstagramIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.instagram.android", 0); //Checks if Instagram is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/accounts/login/")); //Trys to make intent with Instagram's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/accounts/login/")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenYouTubeIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.google.android.youtube", 0); //Checks if YT is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/karthikm128")); //Trys to make intent with YT's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/karthikm128")); //catches and opens a url to the desired page
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionMenu materialDesignFAM;
//        FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3, floatingActionButton4, floatingActionButton5, floatingActionButton6;



//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


//        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.social_floating_menu);
//        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.floating_facebook);
//        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floating_twitter);
//        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.floating_linkdin);
//        floatingActionButton4 = (FloatingActionButton) findViewById(R.id.floating_google_plus);
//        floatingActionButton5 = (FloatingActionButton) findViewById(R.id.floating_instagram);
//        floatingActionButton6 = (FloatingActionButton) findViewById(R.id.floating_youtube);
//
//        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                //TODO something when floating action menu first item clicked
//                Intent facebookIntent = getOpenFacebookIntent(Home.this);
//                startActivity(facebookIntent);
//
//            }
//        });
//        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                //TODO something when floating action menu second item clicked
//                Intent twitterIntent = getOpenTwitterIntent(Home.this);
//                startActivity(twitterIntent);
//
//            }
//        });
//        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                //TODO something when floating action menu third item clicked
//                Intent linkdinIntent = getOpenLinkdinIntent(Home.this);
//                startActivity(linkdinIntent);
//            }
//        });
//
//        floatingActionButton4.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                //TODO something when floating action menu first item clicked
//                Intent googleplusIntent = getOpenGPlusIntent(Home.this);
//                startActivity(googleplusIntent);
//            }
//        });
//        floatingActionButton5.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                //TODO something when floating action menu second item clicked
//                Intent instagramIntent = getOpenInstagramIntent(Home.this);
//                startActivity(instagramIntent);
//            }
//        });
//        floatingActionButton6.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                //TODO something when floating action menu third item clicked
//                Intent youtubeIntent = getOpenYouTubeIntent(Home.this);
//                startActivity(youtubeIntent);
//            }
//        });

//        RapidFloatingActionContentLabelList rfaContent = new RapidFloatingActionContentLabelList(context);
//        rfaContent.setOnRapidFloatingActionContentListener(this);
//        List<RFACLabelItem> items = new ArrayList<>();
//        items.add(new RFACLabelItem<Integer>()
//                .setLabel("Github: wangjiegulu")
//                .setResId(R.mipmap.action_fb)
//                .setIconNormalColor(0xffd84315)
//                .setIconPressedColor(0xffbf360c)
//                .setWrapper(0)
//        );
//        items.add(new RFACLabelItem<Integer>()
//                .setLabel("tiantian.china.2@gmail.com")
//                .setResId(R.mipmap.action_tw)
//                .setIconNormalColor(0xff4e342e)
//                .setIconPressedColor(0xff3e2723)
//                .setLabelColor(Color.WHITE)
//                .setLabelSizeSp(14)
//                .setLabelBackgroundDrawable(ABShape.generateCornerShapeDrawable(0xaa000000, ABTextUtil.dip2px(context, 4)))
//                .setWrapper(1)
//        );
//        items.add(new RFACLabelItem<Integer>()
//                .setLabel("WangJie")
//                .setResId(R.mipmap.action_pn)
//                .setIconNormalColor(0xff056f00)
//                .setIconPressedColor(0xff0d5302)
//                .setLabelColor(0xff056f00)
//                .setWrapper(2)
//        );
//        items.add(new RFACLabelItem<Integer>()
//                .setLabel("Compose")
//                .setResId(R.mipmap.action_tw)
//                .setIconNormalColor(0xff283593)
//                .setIconPressedColor(0xff1a237e)
//                .setLabelColor(0xff283593)
//                .setWrapper(3)
//        );
//        rfaContent
//                .setItems(items)
//                .setIconShadowRadius(ABTextUtil.dip2px(context, 5))
//                .setIconShadowColor(0xff888888)
//                .setIconShadowDy(ABTextUtil.dip2px(context, 5))
//        ;
//        rfabHelper = new RapidFloatingActionHelper(
//                context,
//                rfaLayout,
//                rfaBtn,
//                rfaContent
//        ).build();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(
                R.id.recycler_view_grids);
        recyclerView.addItemDecoration(new MarginDecoration(this));
        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        GridLayoutManager manager = new GridLayoutManager(this, 3);
//        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
////                return (3 - position % 3);
//                switch (position) {
//                    case 0:
//                        return 1;
//                    case 1:
//                        return 1;
//                    case 2:
//                        return 1;
//                    case 3:
//                        return 1;
//                    case 4:
//                        return 1;
//                    case 5:
//                        return 1;
//
//                    case 6:
//                        return 2;
//                    case 7:
//                        return 2;
//                    case 8:
//                        return 2;
//                    case 9:
//                        return 2;
//
//                    default:
//                        return 1;
//
//                }
//            }
//        });
        recyclerView.setLayoutManager(manager);
//        recyclerView.setAdapter(new NumberedAdapter(6));
        recyclerView.setAdapter(new Numbered_Button_Adapter(6));

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Log.d(General_Data.TAG, String.valueOf(position));


//                Toast_Utils.longToast(getApplicationContext(),view.toString());
//                ImageView delete_icon=(ImageView)view.findViewById(R.id.delete_icon);
//                Toast_Utils.longToast(getApplicationContext(),delete_icon.getContentDescription().toString());
                if (((Button) view.findViewById(R.id.button_with_label)).getText().toString().equals("Auto")) {
                    Intent i=new Intent(getApplicationContext(),Advanced_Web_View.class);
                    startActivity(i);
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        recyclerView = (RecyclerView) findViewById(
                R.id.recycler_view_grids_3);
        recyclerView.addItemDecoration(new MarginDecoration(this));
        recyclerView.setHasFixedSize(true);
        manager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(manager);
//        recyclerView.setAdapter(new NumberedAdapter(4));
        recyclerView.setAdapter(new Numbered_Button_Grid3_Adapter(4));

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Log.d(General_Data.TAG, String.valueOf(position));


//                Toast_Utils.longToast(getApplicationContext(),view.toString());
//                ImageView delete_icon=(ImageView)view.findViewById(R.id.delete_icon);
//                Toast_Utils.longToast(getApplicationContext(),delete_icon.getContentDescription().toString());
//                if (((Button) view.findViewById(R.id.button_with_label)).getText().toString().equals("Auto")) {
//                    Intent i=new Intent(getApplicationContext(),Advanced_Web_View.class);
//                    startActivity(i);
//                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

//    @Override
//    public void onRFACItemLabelClick(int position, RFACLabelItem item) {
//        Toast.makeText(getContext(), "clicked label: " + position, Toast.LENGTH_SHORT).show();
//        rfabHelper.toggleContent();
//    }
//
//    @Override
//    public void onRFACItemIconClick(int position, RFACLabelItem item) {
//        Toast.makeText(getContext(), "clicked icon: " + position, Toast.LENGTH_SHORT).show();
//        rfabHelper.toggleContent();
//    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
