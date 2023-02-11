# DMA Demo: Google Chat to Matrix

A demonstration on how to bridge Google Chat to Matrix in a DMA-compliant way.

## 🚨 Not intended for practical usage!

This project is a **demo** and makes a lot of assumptions about how it's running. With some effort, this could be made
into a real, production-ready, app, however in its current state it is fully intended to only show what is possible with
the APIs available.

**This app uses fragile APIs provided by Google in order to operate, and the setup experience is subpar.** There is no
current way around this, but the DMA should make this easier.

**Do not use accounts you care about.** The app assumes it has full control over both the Google and Matrix accounts - it
will make an utter mess of everything if you use accounts you intend to use outside of a demo environment.

**The code is bad, sorry.** This almost certainly is not how you should write an Android app, nor is it really a reference
for how to structure a project. In future this might be improved, but for now it's awful (sorry).

**To reiterate: THIS IS A DEMO.** Even the user IDs the app uses are hardcoded.

## Known bugs

* [ ] GChat -> Matrix doesn't work at all
* [ ] Performance is awful (there's no real caching anywhere)

## Deferred features

These features are not likely to be added to this *demo application*:

* [ ] Images, threads, reactions, real DMs, etc all should be bridged
* [ ] Bridge DMs as DMs rather than as Spaces
* [ ] Bridging new DMs and Spaces after the initial sync from Google Chat

## Building / Installing

Run Android Studio.

## Support

This is a demo. There is no support.

## Contributing

Please do! If you're able to fix a bug from above, submit a PR.

Features are less likely to be accepted/looked at, but bug fixes are very much appreciated.
