package com.firstaid.awareness.data

import com.firstaid.awareness.models.QuizQuestion

val firstAidQuizQuestions = listOf(
    QuizQuestion(
        id = 1,
        category = "Basics & Emergencies",
        question = "What is the primary pan-India emergency number for police, fire, and health?",
        options = listOf("100", "101", "112", "108"),
        correctAnswerIndex = 2,
        explanation = "112 is the single pan-India emergency helpline number for all emergency services."
    ),
    QuizQuestion(
        id = 2,
        category = "Environmental & Injuries",
        question = "For how long should you cool a thermal burn with clean, cool running water?",
        options = listOf("1 to 2 minutes", "10 to 20 minutes", "1 hour", "Never use water"),
        correctAnswerIndex = 1,
        explanation = "Cooling the burn with running water for 10-20 minutes reduces tissue damage and pain."
    ),
    QuizQuestion(
        id = 3,
        category = "Basics & Emergencies",
        question = "What is the recommended rate of chest compressions during adult CPR?",
        options = listOf("40 to 60 per minute", "100 to 120 per minute", "150 to 180 per minute", "30 to 40 per minute"),
        correctAnswerIndex = 1,
        explanation = "Chest compressions should be delivered at a rate of 100 to 120 compressions per minute."
    ),
    QuizQuestion(
        id = 4,
        category = "Trauma & Bleeding",
        question = "What position should you avoid when treating a nosebleed?",
        options = listOf("Tilting head backward", "Leaning forward slightly", "Pinching the soft part of the nose", "Breathing through the mouth"),
        correctAnswerIndex = 0,
        explanation = "Tilting the head backward can cause blood to flow down the throat, leading to choking or nausea."
    ),
    QuizQuestion(
        id = 5,
        category = "Trauma & Bleeding",
        question = "What technique is used for an adult experiencing severe choking with a completely blocked airway?",
        options = listOf("Back blows only", "Abdominal thrusts (Heimlich maneuver)", "Drinking large amounts of water", "Lifting the legs"),
        correctAnswerIndex = 1,
        explanation = "Abdominal thrusts create upward pressure on the diaphragm to expel the blocking object."
    ),
    QuizQuestion(
        id = 6,
        category = "Trauma & Bleeding",
        question = "What is the first and most immediate step to control severe external bleeding?",
        options = listOf("Apply a tourniquet immediately", "Apply direct firm pressure with a clean cloth", "Wash with hot water", "Elevate the legs only"),
        correctAnswerIndex = 1,
        explanation = "Direct firm pressure is the most effective initial method to stop external hemorrhage."
    ),
    QuizQuestion(
        id = 7,
        category = "Environmental & Injuries",
        question = "If an unconscious victim is breathing normally, what position should they be placed in?",
        options = listOf("Flat on their back", "Side recovery position", "Sitting upright", "Face down on stomach"),
        correctAnswerIndex = 1,
        explanation = "The recovery position keeps the airway clear and prevents choking on fluids or vomit."
    ),
    QuizQuestion(
        id = 8,
        category = "Environmental & Injuries",
        question = "What should you NOT do when treating a venomous snake bite?",
        options = listOf("Keep the victim calm", "Wash the wound with soap and water", "Cut the wound or apply a tight tourniquet", "Immobilize the bitten limb"),
        correctAnswerIndex = 2,
        explanation = "Cutting the wound or applying tight tourniquets causes severe tissue damage and accelerates venom spread."
    ),
    QuizQuestion(
        id = 9,
        category = "Trauma & Bleeding",
        question = "What is the golden rule when managing a suspected bone fracture?",
        options = listOf("Attempt to straighten the bone", "Immobilize the limb in the position found", "Massage the fracture site", "Apply heat packs immediately"),
        correctAnswerIndex = 1,
        explanation = "Immobilizing the limb in the position found prevents further injury to blood vessels and nerves."
    ),
    QuizQuestion(
        id = 10,
        category = "Medical & Cardiac",
        question = "If a conscious person shows signs of a heart attack and is not allergic, what medication might dispatch advise giving?",
        options = listOf("Aspirin", "Paracetamol", "Sleeping pills", "Antacid"),
        correctAnswerIndex = 0,
        explanation = "Aspirin helps prevent blood clotting in coronary arteries during a heart attack."
    ),
    QuizQuestion(
        id = 11,
        category = "Environmental & Injuries",
        question = "What is an essential immediate action for someone suffering from severe heatstroke?",
        options = listOf("Wrap in heavy blankets", "Move to a shaded area and cool the body with water", "Give hot caffeinated tea", "Make them run"),
        correctAnswerIndex = 1,
        explanation = "Rapid cooling and moving out of the heat are vital to lower dangerously high core body temperature."
    ),
    QuizQuestion(
        id = 12,
        category = "Environmental & Injuries",
        question = "If a chemical splashes into someone's eyes, what should you do immediately?",
        options = listOf("Cover both eyes tightly with cotton", "Flush eyes continuously with clean running water for at least 15 minutes", "Apply eye makeup", "Rub the eyes vigorously"),
        correctAnswerIndex = 1,
        explanation = "Continuous flushing with water dilutes and removes chemical irritants from the cornea."
    ),
    QuizQuestion(
        id = 13,
        category = "Basics & Emergencies",
        question = "What is the very first thing you must do before helping someone suffering from a live electrical shock?",
        options = listOf("Pull them away with bare hands", "Turn off the power source or disconnect electricity safely", "Throw water on them", "Check their pulse"),
        correctAnswerIndex = 1,
        explanation = "Ensuring the power source is off protects the rescuer from becoming another electrocution victim."
    ),
    QuizQuestion(
        id = 14,
        category = "Medical & Cardiac",
        question = "If someone swallows a poisonous substance, what should you do unless instructed otherwise by poison control?",
        options = listOf("Induce vomiting immediately", "Do not induce vomiting", "Give them raw alcohol", "Walk them briskly"),
        correctAnswerIndex = 1,
        explanation = "Inducing vomiting can cause secondary chemical burns to the esophagus and airway."
    ),
    QuizQuestion(
        id = 15,
        category = "Trauma & Bleeding",
        question = "What does the acronym RICE stand for in soft-tissue injury first aid?",
        options = listOf("Run, Inhale, Cough, Exercise", "Rest, Ice, Compression, Elevation", "Rapid, Intensive, Care, Evaluation", "Reach, Isolate, Call, Evacuate"),
        correctAnswerIndex = 1,
        explanation = "RICE (Rest, Ice, Compression, Elevation) is the standard protocol for managing sprains and strains."
    ),
    QuizQuestion(
        id = 16,
        category = "Basics & Emergencies",
        question = "What does AED stand for in cardiac emergency response?",
        options = listOf("Automated External Defibrillator", "Advanced Electrical Device", "Airway Emergency Director", "Artificial Energy Distributor"),
        correctAnswerIndex = 0,
        explanation = "An AED analyzes heart rhythms and delivers shocks during sudden cardiac arrest if needed."
    ),
    QuizQuestion(
        id = 17,
        category = "Medical & Cardiac",
        question = "During a generalized seizure, what is the best way to protect the person?",
        options = listOf("Hold their arms and legs tightly", "Put a hard object in their mouth", "Clear hard objects and place something soft under their head", "Pour water on their face"),
        correctAnswerIndex = 2,
        explanation = "Protecting the head and clearing sharp objects prevents injury during convulsions without restricting movement."
    ),
    QuizQuestion(
        id = 18,
        category = "Environmental & Injuries",
        question = "How should you warm a person suffering from severe hypothermia?",
        options = listOf("Immerse in very hot water", "Gradually remove wet clothing and wrap in warm blankets", "Apply direct heating pads to bare skin", "Give strong alcohol"),
        correctAnswerIndex = 1,
        explanation = "Gradual rewarming prevents dangerous heart arrhythmias caused by rapid blood flow changes."
    ),
    QuizQuestion(
        id = 19,
        category = "Environmental & Injuries",
        question = "If an adult permanent tooth is knocked out completely, what is the best way to transport it?",
        options = listOf("Throw it away", "Place it in dry tissue paper", "Place it in cold milk or saliva", "Wash it with soap and scrub clean"),
        correctAnswerIndex = 2,
        explanation = "Milk or saliva preserves the periodontal ligament cells on the tooth root for successful reimplantation."
    ),
    QuizQuestion(
        id = 20,
        category = "Medical & Cardiac",
        question = "What life-saving auto-injector is commonly prescribed and used for severe allergic reactions (anaphylaxis)?",
        options = listOf("Insulin", "Epinephrine (EpiPen)", "Morphine", "Antibiotic"),
        correctAnswerIndex = 1,
        explanation = "Epinephrine rapidly reverses severe allergic reactions by opening airways and raising blood pressure."
    )
)
