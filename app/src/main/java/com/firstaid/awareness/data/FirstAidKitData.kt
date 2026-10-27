package com.firstaid.awareness.ui.kit

val firstAidKitItems = listOf(
    KitItem(
        name = "Adhesive Bandages (Band-Aids)",
        category = "Wound Care",
        purpose = "Used to cover minor cuts, scrapes, and punctures to protect against dirt and bacteria.",
        usageTip = "Clean and dry the wound before applying. Change daily or whenever wet.",
        detailedDescription = "Adhesive bandages are staple first aid supplies designed to protect small, superficial wounds from external contamination while allowing natural healing.",
        howToUse = listOf(
            "Clean the wound gently with water and mild soap.",
            "Dry the surrounding skin thoroughly.",
            "Peel off protective wrappers and center the sterile pad over the wound.",
            "Press the adhesive edges down firmly without wrapping too tightly."
        ),
        dos = listOf(
            "Change bandages daily or whenever soiled or wet.",
            "Clean and inspect the wound during bandage changes."
        ),
        donts = listOf(
            "Do not apply adhesive bandages directly to deep, heavy-bleeding puncture wounds.",
            "Do not pull off bandages aggressively from sensitive skin."
        )
    ),
    KitItem(
        name = "Sterile Gauze Pads & Medical Tape",
        category = "Wound Care",
        purpose = "Used for larger wounds, absorbing blood, and securing dressings in place.",
        usageTip = "Do not touch the sterile side of the pad that touches the wound.",
        detailedDescription = "Sterile gauze pads are breathable woven cotton pads used to dress wounds too large for standard adhesive bandages, offering superior blood absorption and protection.",
        howToUse = listOf(
            "Wash hands and put on disposable gloves if available.",
            "Hold sterile gauze pad by its edges and place directly over the wound.",
            "Secure all four edges firmly using medical adhesive tape."
        ),
        dos = listOf(
            "Handle gauze pads only by their outer edges to maintain sterility.",
            "Secure securely to prevent shifting."
        ),
        donts = listOf(
            "Do not touch the center sterile surface with bare fingers.",
            "Do not wrap medical tape completely around a limb tightly as it can restrict blood flow."
        )
    ),
    KitItem(
        name = "Antiseptic Wipes & Solution",
        category = "Disinfection",
        purpose = "Used to clean around wounds and disinfect skin to prevent bacterial infection.",
        usageTip = "Wipe outward from the wound edges. Avoid pouring harsh disinfectants directly inside deep wounds.",
        detailedDescription = "Antiseptic wipes and solutions contain cleansing agents that destroy or inhibit the growth of microorganisms on skin surfaces around injuries.",
        howToUse = listOf(
            "Tear open antiseptic wipe packet.",
            "Gently wipe the skin surrounding the wound in outward motions.",
            "Allow the area to air dry before applying a bandage."
        ),
        dos = listOf(
            "Clean outward away from the wound center.",
            "Use mild antiseptic solutions."
        ),
        donts = listOf(
            "Do not pour harsh rubbing alcohol or bleach directly inside deep open wounds.",
            "Do not scrub delicate healing tissue aggressively."
        )
    ),
    KitItem(
        name = "Disposable Nitrile Gloves",
        category = "Protection",
        purpose = "Protects both the rescuer and the victim from bloodborne pathogens and infection.",
        usageTip = "Always wear clean gloves before touching open wounds or body fluids.",
        detailedDescription = "Disposable nitrile gloves act as a vital protective barrier during first aid administration, preventing transmission of infectious diseases and bacteria.",
        howToUse = listOf(
            "Inspect gloves for any tears or punctures before putting them on.",
            "Slide hands into gloves and adjust snugly over wrists.",
            "Remove carefully after treatment by peeling inside out and discarding safely."
        ),
        dos = listOf(
            "Always put on clean gloves before treating bleeding or open injuries.",
            "Dispose of used gloves in a proper waste container."
        ),
        donts = listOf(
            "Never reuse disposable nitrile gloves.",
            "Do not touch your face, phone, or clean surfaces while wearing contaminated gloves."
        )
    ),
    KitItem(
        name = "Elastic Crepe Bandage",
        category = "Support & Trauma",
        purpose = "Provides compression and support for sprains, strains, and swelling joints.",
        usageTip = "Wrap firmly but not too tightly; check circulation below the bandage (fingers/toes should stay warm).",
        detailedDescription = "An elastic crepe bandage provides adjustable compression to support injured muscles, tendons, and joints while minimizing internal swelling.",
        howToUse = listOf(
            "Start wrapping a few inches below the injury and move upward in overlapping circles.",
            "Overlap each turn by about half the width of the bandage.",
            "Secure the end firmly with metal clips or medical tape."
        ),
        dos = listOf(
            "Wrap firmly to provide comfortable support and compression.",
            "Check circulation regularly (ensure fingers/toes remain warm and pink)."
        ),
        donts = listOf(
            "Do not wrap so tightly that it cuts off blood circulation.",
            "Do not ignore symptoms like numbness, coldness, or blue discoloration."
        )
    ),
    KitItem(
        name = "Medical Scissors & Tweezers",
        category = "Tools",
        purpose = "Scissors are used to cut clothing away from injuries and cut tape. Tweezers remove splinters.",
        usageTip = "Sanitize tweezers with alcohol before and after removing splinters.",
        detailedDescription = "Precision medical tools essential for gaining clear access to injuries by cutting away clothing and safely extracting small foreign objects like splinters.",
        howToUse = listOf(
            "Use medical scissors with blunt lower blades to carefully snip away clothing from wounds.",
            "Sanitize tweezers with antiseptic before grasping splinters close to the skin surface.",
            "Pull straight out gently at the same angle the splinter entered."
        ),
        dos = listOf(
            "Sanitize tools with alcohol before and after every use.",
            "Store scissors and tweezers with protective caps."
        ),
        donts = listOf(
            "Do not dig deep into skin or flesh with tweezers.",
            "Do not use household kitchen scissors on sensitive injury areas."
        )
    ),
    KitItem(
        name = "Digital Thermometer",
        category = "Diagnostics",
        purpose = "Accurately measures body temperature to detect fever or hypothermia.",
        usageTip = "Clean the tip with rubbing alcohol or soap and water after each use.",
        detailedDescription = "A digital thermometer provides quick, precise temperature readings to monitor for fever associated with infections or abnormal body cooling.",
        howToUse = listOf(
            "Turn on the thermometer.",
            "Place the tip securely under the tongue (oral) or armpit (axillary).",
            "Wait for the beep sound, then read and record the temperature."
        ),
        dos = listOf(
            "Clean the sensor tip with rubbing alcohol after each use.",
            "Keep the patient calm and steady during measurement."
        ),
        donts = listOf(
            "Do not take oral temperature immediately after hot or cold beverages.",
            "Do not drop or bend the digital sensor."
        )
    ),
    KitItem(
        name = "Instant Cold Pack",
        category = "Pain & Swelling",
        purpose = "Provides instant cold therapy to reduce swelling, inflammation, and bruising.",
        usageTip = "Squeeze/activate according to package instructions. Wrap in a thin cloth before applying to skin.",
        detailedDescription = "An instant cold pack initiates an endothermic chemical reaction upon activation, providing rapid localized cold therapy without needing a freezer.",
        howToUse = listOf(
            "Squeeze or strike the inner pouch firmly to rupture the liquid compartment.",
            "Shake the pack vigorously to mix contents and activate cooling.",
            "Wrap the pack in a thin towel or cloth and apply to the injured area for 15-20 minutes."
        ),
        dos = listOf(
            "Always wrap the cold pack in a thin cloth before skin contact.",
            "Limit application to 15-20 minutes at a time."
        ),
        donts = listOf(
            "Never apply a freezing cold pack directly to bare skin.",
            "Do not puncture the outer plastic casing."
        )
    ),
    KitItem(
        name = "CPR Barrier Mask / Face Shield",
        category = "Resuscitation",
        purpose = "Provides a sanitary one-way valve barrier during rescue breathing in CPR.",
        usageTip = "Place firmly over the victim's mouth and nose before initiating rescue breaths.",
        detailedDescription = "A CPR face shield with a one-way valve protects the rescuer from direct contact with saliva or breath during cardiopulmonary resuscitation.",
        howToUse = listOf(
            "Tilt the victim's head back and lift chin to open the airway.",
            "Place the mask firmly over the mouth and nose using the contoured shape.",
            "Deliver rescue breaths through the one-way valve while watching for chest rise."
        ),
        dos = listOf(
            "Always use a barrier mask during CPR when available.",
            "Ensure a tight seal around the mouth and nose."
        ),
        donts = listOf(
            "Do not hesitate to perform hands-only CPR if barrier mask is unavailable.",
            "Do not block or obstruct the one-way valve."
        )
    ),
    KitItem(
        name = "Pain Relievers (Paracetamol / Ibuprofen)",
        category = "Medication",
        purpose = "Helps manage headaches, muscle pain, fever, and minor inflammation.",
        usageTip = "Always check for allergies and follow recommended dosage guidelines based on age and weight.",
        detailedDescription = "Over-the-counter analgesic and antipyretic medications used for managing minor aches, pains, sprains, and reducing fever.",
        howToUse = listOf(
            "Check package instructions for correct age and weight dosage.",
            "Take tablets or liquid suspension with a full glass of water."
        ),
        dos = listOf(
            "Follow recommended dosage schedules strictly.",
            "Check expiration dates regularly."
        ),
        donts = listOf(
            "Do not exceed the maximum daily dose.",
            "Do not give aspirin to children or teenagers under 16 due to Reye's syndrome risk."
        )
    )
)
