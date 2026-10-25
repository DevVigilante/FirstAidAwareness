package com.firstaid.awareness.data

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.firstaid.awareness.ui.sources.DataSourceCard
import com.firstaid.awareness.ui.sources.DataSourceItem

@Composable
fun SourcesList() {
    val sources = listOf(
        DataSourceItem(
            title = "Basic Emergency Care & First Aid Guidelines",
            organization = "World Health Organization (WHO)",
            description = "Global standards for first aid, trauma response, and life support training.",
            referenceUrl = "who.int/publications/i/item/9789241550376",
            category = "Global Health"
        ),
        DataSourceItem(
            title = "National First Aid Manual & Standards",
            organization = "Indian Red Cross Society",
            description = "Official guidelines for emergency response, disaster management, and community first aid in India.",
            referenceUrl = "indianredcross.org",
            category = "National"
        ),
        DataSourceItem(
            title = "Disaster Management & Safety Protocols",
            organization = "National Disaster Management Authority (NDMA) India",
            description = "Government guidelines on emergency preparedness, disaster mitigation, and helpline contacts (1078, 112).",
            referenceUrl = "ndma.gov.in",
            category = "Government"
        ),
        DataSourceItem(
            title = "CPR & ECC Guidelines",
            organization = "American Heart Association (AHA)",
            description = "Evidence-based guidelines for cardiopulmonary resuscitation (CPR) and emergency cardiovascular care.",
            referenceUrl = "cpr.heart.org",
            category = "Cardiovascular"
        ),
        DataSourceItem(
            title = "Stop the Bleed Trauma Care",
            organization = "American College of Surgeons Committee on Trauma",
            description = "Public education protocols for hemorrhage control and external bleeding management.",
            referenceUrl = "stopthebleed.org",
            category = "Trauma Care"
        ),
        DataSourceItem(
            title = "National Health Helpline & Emergency Services",
            organization = "Ministry of Health and Family Welfare (MoHFW) India",
            description = "Public health helplines (1075, 108, 112) and medical advisory frameworks across Indian states.",
            referenceUrl = "mohfw.gov.in",
            category = "Public Health"
        )
    )

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Reference Organizations",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        sources.forEach { source ->
            DataSourceCard(source = source)
        }
    }
}
