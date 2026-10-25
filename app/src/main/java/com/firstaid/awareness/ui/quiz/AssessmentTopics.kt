package com.firstaid.awareness.ui.quiz

val assessmentTopicsList = listOf(
    AssessmentTopic(
        id = "burns",
        title = "Burns & Scalds",
        category = "Injury",
        summary = "Evaluate burn depth, size, and location sensitivity.",
        questions = listOf(
            QuizQuestion(1, "Does the burn appear large, deep, or charred/white?", listOf("Yes / unsure", "No, it appears minor")),
            QuizQuestion(2, "Is it on a sensitive area like the face, hands, feet, major joints, or genitals?", listOf("Yes", "No"))
        ),
        highDamageGuidance = AssessmentGuidance(
            title = "Professional assessment recommended",
            description = "A serious or uncertain burn requires professional medical evaluation and specialized care.",
            actions = listOf(
                "Move away from the source of heat if safe.",
                "Start cooling the burn with clean, cool running water for 20 minutes. Never use ice.",
                "Do not remove clothing stuck to the burn.",
                "Do not apply creams, butter, or home remedies.",
                "Call 112 or seek emergency medical help immediately."
            )
        ),
        lowDamageGuidance = AssessmentGuidance(
            title = "Minor burn management",
            description = "The burn appears minor and localized. Standard home first aid is appropriate.",
            actions = listOf(
                "Cool the burn under cool running water for 10-20 minutes.",
                "Cover loosely with a clean non-stick dressing.",
                "Take over-the-counter pain relievers if needed.",
                "Monitor for signs of infection (redness, swelling, pus)."
            )
        )
    ),
    AssessmentTopic(
        id = "choking",
        title = "Choking",
        category = "Airway",
        summary = "Assess breathing ability, airway blockage, and cough response.",
        questions = listOf(
            QuizQuestion(1, "Can the person cough forcefully, speak, or breathe normally?", listOf("No", "Yes")),
            QuizQuestion(2, "Is the person clutching their throat, turning bluish, or unable to make sound?", listOf("Yes", "No"))
        ),
        highDamageGuidance = AssessmentGuidance(
            title = "Severe airway obstruction - Emergency!",
            description = "Complete or severe blockage prevents breathing and requires immediate physical intervention.",
            actions = listOf(
                "Give 5 sharp back blows between the person's shoulder blades.",
                "Give 5 abdominal thrusts (Heimlich maneuver) inward and upward.",
                "Alternate between 5 back blows and 5 thrusts until object is cleared or help arrives.",
                "Call 112 immediately if the person collapses or loses consciousness."
            )
        ),
        lowDamageGuidance = AssessmentGuidance(
            title = "Mild airway obstruction",
            description = "The airway is only partially blocked as the person can still cough and breathe.",
            actions = listOf(
                "Encourage the person to keep coughing to expel the object naturally.",
                "Stay with the person and monitor their breathing closely.",
                "Do not interfere or slap the back unless coughing fails."
            )
        )
    ),
    AssessmentTopic(
        id = "bleeding",
        title = "Bleeding",
        category = "Trauma",
        summary = "Evaluate bleeding rate, blood loss volume, and wound depth.",
        questions = listOf(
            QuizQuestion(1, "Is blood spurting, gushing, or soaking through bandages rapidly?", listOf("Yes / unsure", "No, it is slow/controlled")),
            QuizQuestion(2, "Does the person feel dizzy, faint, or is the wound deep?", listOf("Yes", "No"))
        ),
        highDamageGuidance = AssessmentGuidance(
            title = "Severe hemorrhage - High shock risk",
            description = "Uncontrolled bleeding is life-threatening and requires immediate pressure and emergency response.",
            actions = listOf(
                "Apply firm, continuous direct pressure on the wound using a clean cloth or bandage.",
                "Elevate the injured limb above heart level if possible.",
                "Apply a tourniquet 2-3 inches above the wound if severe limb bleeding does not stop.",
                "Call 112 immediately and keep the victim lying down."
            )
        ),
        lowDamageGuidance = AssessmentGuidance(
            title = "Minor cuts and scrapes",
            description = "Bleeding is minimal and easily manageable with basic first aid.",
            actions = listOf(
                "Wash hands and clean the wound gently with clean water.",
                "Apply gentle pressure with a clean cloth until bleeding stops.",
                "Apply antiseptic ointment and cover with an adhesive bandage."
            )
        )
    ),
    AssessmentTopic(
        id = "fracture",
        title = "Fracture / Broken Bones",
        category = "Orthopedic",
        summary = "Assess bone alignment, deformity, and weight-bearing capability.",
        questions = listOf(
            QuizQuestion(1, "Is the bone visibly deformed, angled abnormally, or piercing through skin?", listOf("Yes / unsure", "No, appears intact")),
            QuizQuestion(2, "Is there severe swelling, inability to move, or extreme pain upon touch?", listOf("Yes", "No"))
        ),
        highDamageGuidance = AssessmentGuidance(
            title = "Suspected severe fracture or dislocation",
            description = "Broken bones require professional immobilization and medical treatment.",
            actions = listOf(
                "Do not attempt to straighten a deformed bone or push a protruding bone back in.",
                "Immobilize the injured limb in the position you found it using a splint or padding.",
                "Apply an ice pack wrapped in cloth to reduce swelling.",
                "Call 112 or transport to emergency care safely."
            )
        ),
        lowDamageGuidance = AssessmentGuidance(
            title = "Possible minor sprain or strain",
            description = "Injury may be soft-tissue related rather than a complete bone break.",
            actions = listOf(
                "Apply RICE protocol: Rest, Ice (15 mins), Compression bandage, Elevation.",
                "Avoid putting weight on the injured area.",
                "Consult a doctor if pain and swelling persist after 48 hours."
            )
        )
    ),
    AssessmentTopic(
        id = "heart_attack",
        title = "Heart Attack",
        category = "Cardiovascular",
        summary = "Evaluate chest discomfort, pressure, and radiating pain symptoms.",
        questions = listOf(
            QuizQuestion(1, "Is the person experiencing severe chest pressure, tightness, or crushing pain?", listOf("Yes / unsure", "No")),
            QuizQuestion(2, "Does pain radiate to the jaw, neck, back, or left arm, accompanied by shortness of breath?", listOf("Yes", "No"))
        ),
        highDamageGuidance = AssessmentGuidance(
            title = "Suspected Heart Attack - Medical Emergency!",
            description = "Heart attacks occur when coronary blood flow is blocked, risking permanent heart damage.",
            actions = listOf(
                "Call 112 immediately to dispatch emergency medical services.",
                "Have the person sit down in a comfortable resting position.",
                "Loosen any tight clothing around the neck and chest.",
                "If conscious and not allergic, give aspirin to chew if advised by dispatch."
            )
        ),
        lowDamageGuidance = AssessmentGuidance(
            title = "Mild chest discomfort",
            description = "Symptoms are mild or non-specific, but should still be monitored.",
            actions = listOf(
                "Have the person rest quietly and avoid physical exertion.",
                "Monitor vital signs and inquire about medical history.",
                "Seek medical evaluation if discomfort persists or recurs."
            )
        )
    ),
    AssessmentTopic(
        id = "cardiac_arrest",
        title = "Cardiac Arrest",
        category = "Emergency",
        summary = "Assess responsiveness, breathing normalcy, and pulse.",
        questions = listOf(
            QuizQuestion(1, "Has the person suddenly collapsed and fails to respond when shaken or shouted at?", listOf("Yes", "No")),
            QuizQuestion(2, "Are they breathing normally or only gasping / not breathing at all?", listOf("No / Gasping", "Normal breathing"))
        ),
        highDamageGuidance = AssessmentGuidance(
            title = "Sudden Cardiac Arrest - Life-threatening!",
            description = "The heart has stopped beating effectively. Immediate CPR and AED use are vital for survival.",
            actions = listOf(
                "Call 112 immediately and request an AED.",
                "Start continuous chest compressions hard and fast (100-120 per minute) in the center of the chest.",
                "Do not stop CPR until emergency personnel arrive or an AED is ready to use.",
                "Use an AED following automated voice prompts immediately if available."
            )
        ),
        lowDamageGuidance = AssessmentGuidance(
            title = "Conscious and breathing normally",
            description = "The person is responsive and breathing adequately; cardiac arrest is not indicated.",
            actions = listOf(
                "Reassure the person and keep them calm.",
                "Check for other injuries or underlying medical issues.",
                "Monitor breathing and responsiveness continuously."
            )
        )
    )
)
