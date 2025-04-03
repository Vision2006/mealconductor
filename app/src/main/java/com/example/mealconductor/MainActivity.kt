package com.example.mealconductor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mealconductor.ui.theme.MealConductorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var meal_mname by remember{
                mutableStateOf("")
            }

            var meal_of_the_day by remember{
                mutableStateOf("")
            }
            
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ){
                Text(
                    text = "Meal Conductor",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Black
                )

                Divider()
                Spacer(modifier = Modifier.size(30.dp))

                OutlinedTextField(
                    value = meal_mname ,
                    onValueChange = {text->
                        meal_mname = text 

                    },
                    placeholder = {
                        Text(text = "Enter meal of the day")
                    }
                )
                Spacer(modifier = Modifier.size(30.dp))

                Row {
                    Button(onClick = {
                        meal_of_the_day = when(meal_mname){
                            "Morning" -> "French toast"
                            "Mid-morning"-> "Greek yogurt with strawberries"
                            "Afternoon"-> "Red bell peppers with guacamole"
                            "Mid-afternoon"->"Grapefruit and cottage cheese"
                            "Dinner"->"Chicken rice bowl"
                            else-> "Unknown day time"
                        }

                    }) {
                        Text(text = "urge")
                    }
                    Button(onClick = {
                        meal_mname = ""
                        meal_of_the_day = ""

                    }) {
                        Text(text = "reset")
                    }
                }
                Text(text = "Your meal for $meal_mname is:")
                Text(text = meal_of_the_day)

                    }
                }
                }
            }


            

