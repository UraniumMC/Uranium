**[加入KCauldronX交流群!](https://jq.qq.com/?_wv=1027&k=4BEK1SI)**
# KCauldronX
### KCauldronX - continuation of KCauldron minecraft server
![Donate][donate_img] [![Download KCauldronX][download_img]][download_url]

## Building KCauldronX
* Ensure you are using Java JDK 8u101 or higher.
* Checkout project
  * You can use IDE or clone from console:
  `git clone https://git.xjboss.net/KC-RELOADED/KCauldronX.git`
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
  * `./gradlew clean setupCauldron jar`


## Issue submitting rule
* First check the bug in single player and vanilla forge, if bug still present - mod issue
* Check with minimal server environment
  * Remove all unnecessary plugins and mods
  * Reset all configs to default
  If bug present - mod compatibility issue
* If you're using beta-release of KCauldronX - check on latest stable
  * All versions situated [there](https://ci.xjboss.net/job/KCauldronX/)
* If bug still present - KCauldronX issue
  * Make sure that similar issue not exists already
  * Please fill [issue form](https://git.xjboss.net/KC-RELOADED/KCauldronX/issues/new) else

[donate_img]: https://prok.pw/donate.png
[download_url]: https://ci.xjboss.net/job/KCauldronX/
[download_img]: https://prok.pw/download.png