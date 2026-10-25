package com.firstaid.awareness.ui.emergency

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun EmergencyContactsList() {
    val contacts = listOf(
        EmergencyContact("National Emergency Number", "112", "Pan-India unified emergency number for police, fire, and health."),
        EmergencyContact("Police", "100", "Immediate police assistance and crime reporting."),
        EmergencyContact("Ambulance / Medical", "108", "Medical emergencies and trauma ambulance services."),
        EmergencyContact("Fire Service", "101", "Fire emergencies, rescue, and hazardous incidents."),
        EmergencyContact("Women Helpline", "1091", "24/7 support for women in distress or facing violence."),
        EmergencyContact("Disaster Management", "1078", "National Disaster Management Authority (NDMA) helpline."),
        EmergencyContact("Child Helpline", "1098", "Assistance for children in need of care and protection."),
        EmergencyContact("Health Helpline (MoHFW)", "1075", "National health helpline for medical queries and guidance.")
    )

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Emergency Contacts in India",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        contacts.forEach { contact ->
            EmergencyContactCard(contact = contact)
        }
    }
}
