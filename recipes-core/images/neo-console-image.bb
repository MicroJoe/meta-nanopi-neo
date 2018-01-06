DESCRIPTION = "A basic console image for NanoPi NEO boards."
LICENSE = "MIT"

IMAGE_FEATURES += "package-management ssh-server-dropbear"

#IMAGE_LINGUAS = "en-us"

inherit core-image

CORE_IMAGE_BASE_INSTALL_remove = " \
	packagegroup-base-extended \
"

FIRMWARE_INSTALL = " \
"

SYSTEM_TOOLS_INSTALL = " \
	i2c-tools \
	cpuburn-neon \
	memtester \
	sysbench \
	htop \
	tmux \
"

DEV_TOOLS_INSTALL = " \
"

NETWORK_TOOLS_INSTALL = " \
	wget \
	curl \
"

MEDIA_TOOLS_INSTALL = " \
"

GRAPHICS_LIBS = " \
"

UTILITIES_INSTALL = " \
	coreutils \
"

IMAGE_INSTALL += " \
  ${FIRMWARE_INSTALL} \
  ${SYSTEM_TOOLS_INSTALL} \
  ${DEV_TOOLS_INSTALL} \
  ${NETWORK_TOOLS_INSTALL} \
  ${MEDIA_TOOLS_INSTALL} \
  ${GRAPHICS_LIBS} \
  ${UTILITIES_INSTALL} \
"

inherit extrausers
EXTRA_USERS_PARAMS = " \
    useradd -P friendlyarm -G sudo friendlyarm; \
"
