package com.firstaid.awareness.ui.learn

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val sampleFirstAidTopics = listOf(
    FirstAidTopic(
        id = "fundamentals",
        title = "Fundamentals of First Aid",
        category = "Basics",
        summary = "Core principles and immediate actions to preserve life and prevent worsening conditions before medical help arrives.",
        detailedDescription = "First aid is the initial assistance or treatment given to a sick or injured person for minor or serious illnesses/injuries in order to preserve life, prevent the condition from worsening, or promote recovery. Knowing the right steps can make a critical difference.",
        keySteps = listOf(
            "Ensure personal and scene safety",
            "Check responsiveness (tap and shout)",
            "Call 112 or emergency services",
            "Provide necessary life support or comfort"
        ),
        dos = listOf(
            "Stay calm and assess the situation",
            "Reassure the victim constantly",
            "Keep the victim warm and comfortable"
        ),
        donts = listOf(
            "Do not move a person with suspected neck or spinal injury",
            "Do not give food or drink to an unconscious person",
            "Do not panic or crowd the victim"
        )
    ),
    FirstAidTopic(
        id = "scene_safety",
        title = "Scene Safety & Assessment",
        category = "Safety",
        summary = "Evaluating hazards to ensure you do not become another victim while attempting to help.",
        detailedDescription = "Before providing any assistance, assessing the scene is paramount. Entering a hazardous environment without precautions can lead to multiple casualties, complicating the emergency response.",
        keySteps = listOf(
            "Scan the area for traffic, fire, electrical wires, or toxic gases",
            "Do not enter hazardous environments without proper training/gear",
            "Use Personal Protective Equipment (PPE) such as gloves if available",
            "Secure the scene and manage bystanders"
        ),
        dos = listOf(
            "Survey the scene thoroughly before approaching",
            "Put on gloves or barrier protection",
            "Direct bystanders to call emergency services"
        ),
        donts = listOf(
            "Do not rush into burning buildings or live electrical zones",
            "Do not ignore potential structural or environmental dangers"
        )
    ),
    FirstAidTopic(
        id = "heart_vs_cardiac",
        title = "Heart Attack vs Cardiac Arrest",
        category = "Emergency",
        summary = "Distinguishing between a blocked coronary artery (heart attack) and electrical malfunction of the heart (cardiac arrest).",
        detailedDescription = "People often use these terms interchangeably, but they are entirely different medical events. A heart attack is a 'plumbing' problem (blocked blood flow), whereas cardiac arrest is an 'electrical' problem (heart abruptly stops beating effectively).",
        keySteps = listOf(
            "Heart Attack: Person is conscious; experiences chest pain, shortness of breath, cold sweat",
            "Cardiac Arrest: Person collapses suddenly, unconscious, unresponsive, not breathing normally",
            "Cardiac Arrest Action: Call 112 immediately, start CPR chest compressions, and use an AED if available"
        ),
        dos = listOf(
            "Call 112 immediately for suspected cardiac arrest or severe chest pain",
            "Start continuous chest compressions (100-120 per minute) for cardiac arrest",
            "Loosen tight clothing around the neck and chest"
        ),
        donts = listOf(
            "Do not leave an unresponsive person unattended",
            "Do not delay CPR while waiting for emergency responders"
        )
    ),
    FirstAidTopic(
        id = "burn_care",
        title = "Burn Care & Management",
        category = "Injury",
        summary = "Proper first aid treatment for thermal, chemical, or electrical burns to minimize tissue damage.",
        detailedDescription = "Burns damage skin tissue and can cause severe pain, shock, and infection. Immediate cooling and proper covering are essential for effective burn management.",
        keySteps = listOf(
            "Cool the burn with cool (not ice-cold) running water for 10-20 minutes",
            "Remove rings, watches, or tight clothing before swelling starts",
            "Cover loosely with sterile non-stick bandage or clean cloth",
            "Do NOT apply ice, butter, toothpaste, or greasy ointments"
        ),
        dos = listOf(
            "Use cool running water immediately",
            "Cover the burn loosely with sterile non-fluffy dressing",
            "Seek medical attention for severe, electrical, or chemical burns"
        ),
        donts = listOf(
            "Do not apply ice, ice water, butter, oils, or adhesive bandages directly",
            "Do not rupture or puncture blisters"
        )
    ),
    FirstAidTopic(
        id = "bleeding_control",
        title = "Bleeding Awareness & Control",
        category = "Trauma",
        summary = "Techniques to control severe external bleeding and prevent shock from blood loss.",
        detailedDescription = "Severe external bleeding is life-threatening. Applying direct, firm pressure stops blood flow and allows natural clotting to occur rapidly.",
        keySteps = listOf(
            "Apply direct firm pressure on the wound using a sterile dressing or clean cloth",
            "Maintain continuous pressure without lifting to check if bleeding stopped",
            "Elevate the injured limb above heart level if possible",
            "Apply a tourniquet 2-3 inches above the wound if severe bleeding from limbs is uncontrollable"
        ),
        dos = listOf(
            "Apply firm and constant direct pressure",
            "Use clean dressings or cloths",
            "Keep the victim lying down to prevent fainting/shock"
        ),
        donts = listOf(
            "Do not lift the bandage to check if bleeding has stopped prematurely",
            "Do not remove embedded objects from the wound"
        )
    )
)

@Composable
@Preview(showBackground = true)
fun LearnTopicsListPreview() {
    LearnTopicsList(onTopicClick = {})
}

@Composable
fun LearnTopicsList(onTopicClick: (FirstAidTopic) -> Unit) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Essential First Aid Topics",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        sampleFirstAidTopics.forEach { topic ->
            LearnTopicCard(topic = topic, onClick = { onTopicClick(topic) })
        }
    }
}
