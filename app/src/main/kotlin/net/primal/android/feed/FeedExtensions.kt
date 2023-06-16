package net.primal.android.feed

fun String.isTrendingFeed(): Boolean = this.endsWith("trending")

fun String.isPopularFeed(): Boolean = this.endsWith("popular")

fun String.isMostZappedFeed(): Boolean = this.endsWith("mostzapped4h")

fun String.isLatestFeed(): Boolean = !isTrendingFeed() && !isPopularFeed() && !isMostZappedFeed()

fun String.isNotLatestFeed(): Boolean = !isLatestFeed()