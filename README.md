**[加入Uranium官方钦定交流群!](https://jq.qq.com/?_wv=1027&k=4BEK1SI)**

**[Join UraniumMC offical discord chat room](https://discord.gg/dCjehb3)**
# Uranium
### Uranium - continuation of KCauldron minecraft server
[![Build Status][build_status]](https://ci.aimc.vip/job/Uranium) [![Download Uranium][download_img]][download_url] [![bStats][bStats]][bStats_link] [![yumc Stats][yumc_Stats]][yumc_Stats_link]

## Building Uranium
* Ensure you are using Java JDK 8u101 or higher.
* Checkout project
  * You can use IDE or clone from console:
  `git clone https://git.aimc.vip/UraniumDev/Uranium.git`
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
* If you're using beta-release of Uranium - check on latest stable
  * All versions situated [there](https://ci.aimc.vip/job/Uranium)
* If bug still present - Uranium issue
  * Make sure that similar issue not exists already
  * Please fill [issue form](https://git.aimc.vip/UraniumDev/Uranium/issues/new) else

[donate_img]: https://git.aimc.vip/static/donate-Bitcoin.svg
[download_url]: https://pan.baidu.com/s/1jI42BHG#list/path=/Uranium/%23lastSuccessfulBuild
[download_img]: https://git.aimc.vip/static/download-latest.svg
[build_status]: https://ci.aimc.vip/job/Uranium/badge/icon
[bStats]: https://git.aimc.vip/static/bStats-Uranium.svg
[bStats_link]: https://bstats.org/plugin/bukkit/Uranium
[yumc_Stats]: https://git.aimc.vip/static/yumc-UM.svg
[yumc_Stats_link]: http://www.yumc.pw/Home/Statistics/Plugin.html?name=Uranium