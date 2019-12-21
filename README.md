# team-schedule
Simple schedule written in java

# Usage from command line
>team-schedule input_file.json [output_file]

# Input data example
see input/teams.json

# Output data
for the example input data the output should look like:
```
First round:
So 18.08.2019 | Bayern München - RB Leipzig
So 18.08.2019 | 1. FC Köln - SC Freiburg
So 18.08.2019 | SC Paderborn 07 - Eintracht Frankfurt
So 18.08.2019 | Hertha BSC - 1. FSV Mainz 05
So 18.08.2019 | Borussia Dortmund - Werder Bremen
So 18.08.2019 | Bayer 04 Leverkusen - 1. FC Union Berlin
So 18.08.2019 | TSG Hoffenheim - Fortuna Düsseldorf
So 18.08.2019 | FC Schalke 04 - Bor. Mönchengladbach
So 18.08.2019 | VfL Wolfsburg - FC Augsburg
So 25.08.2019 | RB Leipzig - 1. FSV Mainz 05
So 25.08.2019 | Werder Bremen - Bayer 04 Leverkusen
So 25.08.2019 | Borussia Dortmund - FC Augsburg
So 25.08.2019 | FC Schalke 04 - Eintracht Frankfurt
So 25.08.2019 | SC Freiburg - SC Paderborn 07
So 25.08.2019 | 1. FC Köln - Bayern München
So 25.08.2019 | TSG Hoffenheim - 1. FC Union Berlin
So 25.08.2019 | Fortuna Düsseldorf - VfL Wolfsburg
So 25.08.2019 | Bor. Mönchengladbach - Hertha BSC
So 01.09.2019 | FC Schalke 04 - RB Leipzig
So 01.09.2019 | Fortuna Düsseldorf - Borussia Dortmund
So 01.09.2019 | SC Freiburg - Eintracht Frankfurt
So 01.09.2019 | Bayer 04 Leverkusen - 1. FC Köln
So 01.09.2019 | VfL Wolfsburg - Werder Bremen
So 01.09.2019 | 1. FC Union Berlin - Bayern München
So 01.09.2019 | FC Augsburg - Hertha BSC
So 01.09.2019 | 1. FSV Mainz 05 - SC Paderborn 07
So 01.09.2019 | TSG Hoffenheim - Bor. Mönchengladbach
So 08.09.2019 | RB Leipzig - Hertha BSC
So 08.09.2019 | Bayern München - Borussia Dortmund
So 08.09.2019 | Eintracht Frankfurt - Fortuna Düsseldorf
So 08.09.2019 | VfL Wolfsburg - 1. FC Köln
So 08.09.2019 | FC Schalke 04 - Bayer 04 Leverkusen
So 08.09.2019 | Bor. Mönchengladbach - Werder Bremen
So 08.09.2019 | SC Freiburg - 1. FSV Mainz 05
So 08.09.2019 | FC Augsburg - SC Paderborn 07
So 15.09.2019 | SC Paderborn 07 - Borussia Dortmund
So 15.09.2019 | FC Schalke 04 - Fortuna Düsseldorf
So 15.09.2019 | Eintracht Frankfurt - TSG Hoffenheim
So 15.09.2019 | VfL Wolfsburg - SC Freiburg
So 15.09.2019 | Werder Bremen - 1. FSV Mainz 05
So 15.09.2019 | Bayern München - FC Augsburg
So 15.09.2019 | Hertha BSC - 1. FC Köln
So 15.09.2019 | 1. FC Union Berlin - RB Leipzig
So 15.09.2019 | Bayer 04 Leverkusen - Bor. Mönchengladbach
So 22.09.2019 | Borussia Dortmund - 1. FSV Mainz 05
So 22.09.2019 | Fortuna Düsseldorf - RB Leipzig
So 22.09.2019 | FC Schalke 04 - Werder Bremen
So 22.09.2019 | TSG Hoffenheim - SC Freiburg
So 22.09.2019 | Hertha BSC - Bayer 04 Leverkusen
So 22.09.2019 | 1. FC Köln - FC Augsburg
So 22.09.2019 | Bayern München - Eintracht Frankfurt
So 22.09.2019 | Bor. Mönchengladbach - 1. FC Union Berlin
So 22.09.2019 | SC Paderborn 07 - VfL Wolfsburg
So 29.09.2019 | Borussia Dortmund - Bayer 04 Leverkusen
So 29.09.2019 | SC Freiburg - RB Leipzig
So 29.09.2019 | FC Schalke 04 - SC Paderborn 07
So 29.09.2019 | 1. FC Union Berlin - Werder Bremen
So 29.09.2019 | 1. FSV Mainz 05 - FC Augsburg
So 29.09.2019 | Bor. Mönchengladbach - Bayern München
So 29.09.2019 | Fortuna Düsseldorf - 1. FC Köln
So 29.09.2019 | Eintracht Frankfurt - VfL Wolfsburg
So 29.09.2019 | Hertha BSC - TSG Hoffenheim
So 06.10.2019 | Borussia Dortmund - RB Leipzig
So 06.10.2019 | 1. FC Union Berlin - SC Freiburg
So 06.10.2019 | Werder Bremen - 1. FC Köln
So 06.10.2019 | Bayer 04 Leverkusen - VfL Wolfsburg
So 06.10.2019 | 1. FSV Mainz 05 - Eintracht Frankfurt
So 06.10.2019 | Hertha BSC - Bayern München
So 06.10.2019 | SC Paderborn 07 - Bor. Mönchengladbach
So 06.10.2019 | Fortuna Düsseldorf - FC Augsburg
So 06.10.2019 | FC Schalke 04 - TSG Hoffenheim
So 13.10.2019 | Hertha BSC - Borussia Dortmund
So 13.10.2019 | RB Leipzig - Werder Bremen
So 13.10.2019 | 1. FC Köln - SC Paderborn 07
So 13.10.2019 | Bayer 04 Leverkusen - Fortuna Düsseldorf
So 13.10.2019 | Bor. Mönchengladbach - Eintracht Frankfurt
So 13.10.2019 | 1. FSV Mainz 05 - FC Schalke 04
So 13.10.2019 | VfL Wolfsburg - TSG Hoffenheim
So 13.10.2019 | 1. FC Union Berlin - FC Augsburg
So 13.10.2019 | SC Freiburg - Bayern München
So 20.10.2019 | Borussia Dortmund - TSG Hoffenheim
So 20.10.2019 | FC Augsburg - RB Leipzig
So 20.10.2019 | 1. FC Köln - Eintracht Frankfurt
So 20.10.2019 | 1. FC Union Berlin - Fortuna Düsseldorf
So 20.10.2019 | VfL Wolfsburg - 1. FSV Mainz 05
So 20.10.2019 | SC Paderborn 07 - Bayern München
So 20.10.2019 | SC Freiburg - Bor. Mönchengladbach
So 20.10.2019 | Werder Bremen - Hertha BSC
So 27.10.2019 | 1. FC Köln - Borussia Dortmund
So 27.10.2019 | TSG Hoffenheim - Bayer 04 Leverkusen
So 27.10.2019 | SC Paderborn 07 - RB Leipzig
So 27.10.2019 | 1. FSV Mainz 05 - Bor. Mönchengladbach
So 27.10.2019 | 1. FC Union Berlin - Hertha BSC
So 27.10.2019 | VfL Wolfsburg - Bayern München
So 27.10.2019 | Werder Bremen - Fortuna Düsseldorf
So 27.10.2019 | FC Augsburg - Eintracht Frankfurt
So 27.10.2019 | FC Schalke 04 - SC Freiburg
So 03.11.2019 | Borussia Dortmund - SC Freiburg
So 03.11.2019 | 1. FC Köln - 1. FSV Mainz 05
So 03.11.2019 | Bayer 04 Leverkusen - FC Augsburg
So 03.11.2019 | SC Paderborn 07 - Fortuna Düsseldorf
So 03.11.2019 | Werder Bremen - TSG Hoffenheim
So 03.11.2019 | FC Schalke 04 - VfL Wolfsburg
So 03.11.2019 | Eintracht Frankfurt - Hertha BSC
So 03.11.2019 | Bor. Mönchengladbach - RB Leipzig
So 10.11.2019 | VfL Wolfsburg - Borussia Dortmund
So 10.11.2019 | Bor. Mönchengladbach - 1. FC Köln
So 10.11.2019 | Bayer 04 Leverkusen - RB Leipzig
So 10.11.2019 | Fortuna Düsseldorf - 1. FSV Mainz 05
So 10.11.2019 | TSG Hoffenheim - Bayern München
So 10.11.2019 | SC Freiburg - Hertha BSC
So 10.11.2019 | SC Paderborn 07 - 1. FC Union Berlin
So 10.11.2019 | Eintracht Frankfurt - Werder Bremen
So 10.11.2019 | FC Augsburg - FC Schalke 04
So 17.11.2019 | FC Schalke 04 - Borussia Dortmund
So 17.11.2019 | 1. FSV Mainz 05 - Bayer 04 Leverkusen
So 17.11.2019 | FC Augsburg - Bor. Mönchengladbach
So 17.11.2019 | 1. FC Köln - RB Leipzig
So 17.11.2019 | VfL Wolfsburg - 1. FC Union Berlin
So 17.11.2019 | Fortuna Düsseldorf - Bayern München
So 17.11.2019 | Werder Bremen - SC Freiburg
So 17.11.2019 | SC Paderborn 07 - TSG Hoffenheim
So 24.11.2019 | Eintracht Frankfurt - Borussia Dortmund
So 24.11.2019 | Bayer 04 Leverkusen - Bayern München
So 24.11.2019 | SC Paderborn 07 - Werder Bremen
So 24.11.2019 | VfL Wolfsburg - Bor. Mönchengladbach
So 24.11.2019 | RB Leipzig - TSG Hoffenheim
So 24.11.2019 | Fortuna Düsseldorf - Hertha BSC
So 24.11.2019 | FC Schalke 04 - 1. FC Köln
So 24.11.2019 | 1. FC Union Berlin - 1. FSV Mainz 05
So 24.11.2019 | FC Augsburg - SC Freiburg
So 01.12.2019 | Borussia Dortmund - Bor. Mönchengladbach
So 01.12.2019 | Bayer 04 Leverkusen - Eintracht Frankfurt
So 01.12.2019 | 1. FSV Mainz 05 - Bayern München
So 01.12.2019 | FC Augsburg - Werder Bremen
So 01.12.2019 | TSG Hoffenheim - 1. FC Köln
So 01.12.2019 | VfL Wolfsburg - Hertha BSC
So 01.12.2019 | Fortuna Düsseldorf - SC Freiburg
So 01.12.2019 | FC Schalke 04 - 1. FC Union Berlin
So 08.12.2019 | 1. FC Union Berlin - Eintracht Frankfurt
So 08.12.2019 | Bayern München - Werder Bremen
So 08.12.2019 | Bayer 04 Leverkusen - SC Paderborn 07
So 08.12.2019 | TSG Hoffenheim - 1. FSV Mainz 05
So 08.12.2019 | RB Leipzig - VfL Wolfsburg
So 08.12.2019 | Bor. Mönchengladbach - Fortuna Düsseldorf
So 08.12.2019 | Hertha BSC - FC Schalke 04
So 15.12.2019 | Bayer 04 Leverkusen - SC Freiburg
So 15.12.2019 | FC Schalke 04 - Bayern München
So 15.12.2019 | RB Leipzig - Eintracht Frankfurt
So 15.12.2019 | FC Augsburg - TSG Hoffenheim
So 15.12.2019 | 1. FC Union Berlin - Borussia Dortmund
So 15.12.2019 | Hertha BSC - SC Paderborn 07
So 22.12.2019 | 1. FC Köln - 1. FC Union Berlin
Second round:
So 29.12.2019 | Fortuna Düsseldorf - Eintracht Frankfurt
So 29.12.2019 | 1. FSV Mainz 05 - Werder Bremen
So 29.12.2019 | Bayer 04 Leverkusen - Borussia Dortmund
So 29.12.2019 | SC Freiburg - VfL Wolfsburg
So 29.12.2019 | RB Leipzig - 1. FC Union Berlin
So 29.12.2019 | Bor. Mönchengladbach - FC Schalke 04
So 29.12.2019 | 1. FC Köln - Hertha BSC
So 29.12.2019 | FC Augsburg - Bayern München
So 29.12.2019 | TSG Hoffenheim - SC Paderborn 07
So 05.01.2020 | TSG Hoffenheim - Eintracht Frankfurt
So 05.01.2020 | 1. FC Köln - Bayer 04 Leverkusen
So 05.01.2020 | 1. FSV Mainz 05 - Hertha BSC
So 05.01.2020 | RB Leipzig - FC Schalke 04
So 05.01.2020 | FC Augsburg - VfL Wolfsburg
So 05.01.2020 | SC Paderborn 07 - SC Freiburg
So 05.01.2020 | Bayern München - Bor. Mönchengladbach
So 05.01.2020 | Borussia Dortmund - Fortuna Düsseldorf
So 05.01.2020 | Werder Bremen - 1. FC Union Berlin
So 12.01.2020 | Eintracht Frankfurt - FC Schalke 04
So 12.01.2020 | 1. FSV Mainz 05 - SC Freiburg
So 12.01.2020 | RB Leipzig - FC Augsburg
So 12.01.2020 | TSG Hoffenheim - Borussia Dortmund
So 12.01.2020 | Bayern München - Bayer 04 Leverkusen
So 12.01.2020 | VfL Wolfsburg - Fortuna Düsseldorf
So 12.01.2020 | Hertha BSC - Bor. Mönchengladbach
So 12.01.2020 | SC Paderborn 07 - 1. FC Köln
So 19.01.2020 | Eintracht Frankfurt - 1. FSV Mainz 05
So 19.01.2020 | FC Augsburg - Bayer 04 Leverkusen
So 19.01.2020 | RB Leipzig - SC Freiburg
So 19.01.2020 | 1. FC Union Berlin - VfL Wolfsburg
So 19.01.2020 | TSG Hoffenheim - Werder Bremen
So 19.01.2020 | Fortuna Düsseldorf - SC Paderborn 07
So 19.01.2020 | Bayern München - Hertha BSC
So 19.01.2020 | Bor. Mönchengladbach - Borussia Dortmund
So 19.01.2020 | 1. FC Köln - FC Schalke 04
So 26.01.2020 | SC Paderborn 07 - 1. FSV Mainz 05
So 26.01.2020 | Eintracht Frankfurt - 1. FC Köln
So 26.01.2020 | FC Augsburg - 1. FC Union Berlin
So 26.01.2020 | Bayer 04 Leverkusen - Werder Bremen
So 26.01.2020 | RB Leipzig - Borussia Dortmund
So 26.01.2020 | TSG Hoffenheim - VfL Wolfsburg
So 26.01.2020 | Bayern München - Fortuna Düsseldorf
So 26.01.2020 | Bor. Mönchengladbach - SC Freiburg
So 26.01.2020 | FC Schalke 04 - Hertha BSC
So 02.02.2020 | Bor. Mönchengladbach - 1. FSV Mainz 05
So 02.02.2020 | Werder Bremen - Eintracht Frankfurt
So 02.02.2020 | Hertha BSC - 1. FC Union Berlin
So 02.02.2020 | VfL Wolfsburg - Bayer 04 Leverkusen
So 02.02.2020 | RB Leipzig - Fortuna Düsseldorf
So 02.02.2020 | Borussia Dortmund - Bayern München
So 02.02.2020 | SC Paderborn 07 - FC Augsburg
So 02.02.2020 | TSG Hoffenheim - FC Schalke 04
So 02.02.2020 | SC Freiburg - 1. FC Köln
So 09.02.2020 | FC Schalke 04 - 1. FSV Mainz 05
So 09.02.2020 | SC Freiburg - 1. FC Union Berlin
So 09.02.2020 | Eintracht Frankfurt - SC Paderborn 07
So 09.02.2020 | Werder Bremen - RB Leipzig
So 09.02.2020 | Bayer 04 Leverkusen - Hertha BSC
So 09.02.2020 | 1. FC Köln - Fortuna Düsseldorf
So 09.02.2020 | Bayern München - TSG Hoffenheim
So 09.02.2020 | Borussia Dortmund - VfL Wolfsburg
So 09.02.2020 | Bor. Mönchengladbach - FC Augsburg
So 16.02.2020 | Bayer 04 Leverkusen - 1. FSV Mainz 05
So 16.02.2020 | Werder Bremen - Borussia Dortmund
So 16.02.2020 | Hertha BSC - Eintracht Frankfurt
So 16.02.2020 | RB Leipzig - Bayern München
So 16.02.2020 | 1. FC Union Berlin - TSG Hoffenheim
So 16.02.2020 | Fortuna Düsseldorf - FC Schalke 04
So 16.02.2020 | Bor. Mönchengladbach - SC Paderborn 07
So 16.02.2020 | FC Augsburg - 1. FC Köln
So 23.02.2020 | 1. FSV Mainz 05 - 1. FC Köln
So 23.02.2020 | Hertha BSC - SC Freiburg
So 23.02.2020 | FC Augsburg - Fortuna Düsseldorf
So 23.02.2020 | Bayer 04 Leverkusen - FC Schalke 04
So 23.02.2020 | Eintracht Frankfurt - Bor. Mönchengladbach
So 23.02.2020 | 1. FC Union Berlin - SC Paderborn 07
So 23.02.2020 | Werder Bremen - VfL Wolfsburg
So 23.02.2020 | TSG Hoffenheim - RB Leipzig
So 01.03.2020 | 1. FSV Mainz 05 - Fortuna Düsseldorf
So 01.03.2020 | SC Freiburg - Bayer 04 Leverkusen
So 01.03.2020 | Eintracht Frankfurt - FC Augsburg
So 01.03.2020 | Borussia Dortmund - Hertha BSC
So 01.03.2020 | Werder Bremen - Bor. Mönchengladbach
So 01.03.2020 | Bayern München - VfL Wolfsburg
So 01.03.2020 | 1. FC Union Berlin - FC Schalke 04
So 01.03.2020 | 1. FC Köln - TSG Hoffenheim
So 01.03.2020 | RB Leipzig - SC Paderborn 07
So 08.03.2020 | Fortuna Düsseldorf - Bayer 04 Leverkusen
So 08.03.2020 | SC Freiburg - Werder Bremen
So 08.03.2020 | VfL Wolfsburg - SC Paderborn 07
So 08.03.2020 | Bor. Mönchengladbach - TSG Hoffenheim
So 08.03.2020 | Borussia Dortmund - Eintracht Frankfurt
So 08.03.2020 | Bayern München - FC Schalke 04
So 08.03.2020 | Hertha BSC - RB Leipzig
So 08.03.2020 | 1. FSV Mainz 05 - 1. FC Union Berlin
So 15.03.2020 | Fortuna Düsseldorf - Werder Bremen
So 15.03.2020 | SC Freiburg - Borussia Dortmund
So 15.03.2020 | Bayer 04 Leverkusen - TSG Hoffenheim
So 15.03.2020 | RB Leipzig - Bor. Mönchengladbach
So 15.03.2020 | Bayern München - 1. FC Köln
So 15.03.2020 | FC Augsburg - 1. FSV Mainz 05
So 15.03.2020 | VfL Wolfsburg - Eintracht Frankfurt
So 15.03.2020 | SC Paderborn 07 - FC Schalke 04
So 22.03.2020 | Werder Bremen - FC Augsburg
So 22.03.2020 | Fortuna Düsseldorf - TSG Hoffenheim
So 22.03.2020 | SC Paderborn 07 - Bayer 04 Leverkusen
So 22.03.2020 | Borussia Dortmund - FC Schalke 04
So 22.03.2020 | Bayern München - SC Freiburg
So 22.03.2020 | 1. FC Köln - VfL Wolfsburg
So 22.03.2020 | 1. FSV Mainz 05 - RB Leipzig
So 22.03.2020 | Eintracht Frankfurt - 1. FC Union Berlin
So 29.03.2020 | 1. FSV Mainz 05 - TSG Hoffenheim
So 29.03.2020 | Werder Bremen - Bayern München
So 29.03.2020 | Eintracht Frankfurt - SC Freiburg
So 29.03.2020 | Borussia Dortmund - SC Paderborn 07
So 29.03.2020 | VfL Wolfsburg - RB Leipzig
So 29.03.2020 | Bor. Mönchengladbach - Bayer 04 Leverkusen
So 29.03.2020 | FC Schalke 04 - FC Augsburg
So 29.03.2020 | Fortuna Düsseldorf - 1. FC Union Berlin
So 05.04.2020 | Hertha BSC - Werder Bremen
So 05.04.2020 | Borussia Dortmund - 1. FC Köln
So 05.04.2020 | SC Freiburg - TSG Hoffenheim
So 05.04.2020 | Eintracht Frankfurt - Bayer 04 Leverkusen
So 05.04.2020 | Fortuna Düsseldorf - Bor. Mönchengladbach
So 05.04.2020 | Bayern München - 1. FC Union Berlin
So 05.04.2020 | VfL Wolfsburg - FC Schalke 04
So 12.04.2020 | FC Augsburg - Borussia Dortmund
So 12.04.2020 | Werder Bremen - SC Paderborn 07
So 12.04.2020 | 1. FC Union Berlin - Bayer 04 Leverkusen
So 12.04.2020 | 1. FC Köln - Bor. Mönchengladbach
So 12.04.2020 | Eintracht Frankfurt - Bayern München
So 12.04.2020 | Hertha BSC - VfL Wolfsburg
So 12.04.2020 | SC Freiburg - Fortuna Düsseldorf
So 19.04.2020 | Werder Bremen - FC Schalke 04
So 19.04.2020 | SC Freiburg - FC Augsburg
So 19.04.2020 | Borussia Dortmund - 1. FC Union Berlin
So 19.04.2020 | SC Paderborn 07 - Hertha BSC
So 19.04.2020 | Bayern München - 1. FSV Mainz 05
So 19.04.2020 | RB Leipzig - 1. FC Köln
So 19.04.2020 | Bor. Mönchengladbach - VfL Wolfsburg
So 26.04.2020 | Hertha BSC - FC Augsburg
So 26.04.2020 | 1. FSV Mainz 05 - Borussia Dortmund
So 26.04.2020 | RB Leipzig - Bayer 04 Leverkusen
So 26.04.2020 | Bayern München - SC Paderborn 07
So 26.04.2020 | 1. FC Union Berlin - Bor. Mönchengladbach
So 26.04.2020 | SC Freiburg - FC Schalke 04
So 26.04.2020 | 1. FC Köln - Werder Bremen
So 03.05.2020 | TSG Hoffenheim - Hertha BSC
So 03.05.2020 | Eintracht Frankfurt - RB Leipzig
So 03.05.2020 | 1. FSV Mainz 05 - VfL Wolfsburg
So 03.05.2020 | 1. FC Union Berlin - 1. FC Köln
So 10.05.2020 | TSG Hoffenheim - FC Augsburg
So 10.05.2020 | Hertha BSC - Fortuna Düsseldorf
```
