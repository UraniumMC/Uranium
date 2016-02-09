**[Join KCauldron's Discord!](https://discord.gg/0nuu0DLm3WJq1Z23)**
# KCauldron
### KCauldron - continuation of Cauldron minecraft server
[![Donate][donate_img]][donate_url][![Download KCauldron][download_img]][download_url]

## Building KCauldron
* Checkout project
  * You can use IDE or clone from console:
  `git clone https://gitlab.prok.pw/Prototik/KCauldron.git`
* Init submodules
  * Since this project is merger of two other we need both.
  `git submodule update --init --recursive`
* Setup initial workspace
  * This process download minecraft and apply patches
  * If you have gradle integration in IDE - you can still use gui
  `./gradlew setupCauldron`
* Build both legacy server jar & default jar
  `./gradlew jar`

## Updating sources
If you're once checkout source - you not need to do it again
* Update sources
  * `git pull origin master`
* Reapply patches & build binaries
  * `./gradle clean setupCauldron jar`


## Issue submitting rule
* First check the bug in single player and vanilla forge, if bug still present - mod issue
* Check with minimal server environment
  * Remove all unnecessary plugins and mods
  * Reset all configs to default
  If bug present - mod compatibility issue
* If you're using beta-release of KCauldron - check on latest stable
  * All versions situated [there](https://repo.prok.pw/pw/prok/KCauldron/?C=M&O=D)
* If bug still present - KCauldron issue
  * Make sure that similar issue not exists already
  * Please fill [issue form](https://gitlab.prok.pw/Prototik/KCauldron/issues/new) else

[donate_url]: https://prok.pw/donate.html
[donate_img]: https://prok.pw/donate.png
[download_url]: https://prok.pw/downloads.html#pw.prok:KCauldron
[download_img]: https://prok.pw/download.png