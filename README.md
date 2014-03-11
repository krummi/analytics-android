analytics-android
=================

This is OZ's fork of the [Segment.io](https://segment.io) Android library which we have adapted to fit our needs. This library is designed to communicate with our analytics event engine (analytics_z) even though the changes from the original library are minimal and mainly consist of the following alterations:

* Endpoints have been updated. [Commit](https://github.com/ozinc/analytics-android/commit/8b03a099bfa9dce82a4b800640d4481be92e2b92).  
* All bundled libraries have been removed. [Commit](https://github.com/ozinc/analytics-android/commit/d00587788353b06b7940a802fe15be95a3c7f599). 
* Consequently, all providers have been removed. [Same commit](https://github.com/ozinc/analytics-android/commit/d00587788353b06b7940a802fe15be95a3c7f599).
* Hacky workaround has been added to prevent the library from using the SegmentIO's settings endpoint. [Commit](https://github.com/ozinc/analytics-android/commit/a8920e3ce08dd2329e64f174a306595f5000b69b).
* Gradleized. Commits [#1](https://github.com/ozinc/analytics-android/commit/b1b236ba527f02746f3b335d1ff1635f8ed86aea) and [#2](https://github.com/ozinc/analytics-android/commit/8b03a099bfa9dce82a4b800640d4481be92e2b92).

The only item in the aforementioned list that is not fairly self-explanatory is the settings hack. The problems here is that the original SegmentIO library contacts their REST API via the settings endpoint to retrieve data on which providers are enabled and which are not. As we have removed all of the providers we don't want this to happen.

## License

The MIT License.

Copyright (c) 2013 Segment.io Inc. <friends@segment.io> and Hrafn Eiríksson of OZ <hrafn@oz.com>.

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the 'Software'), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
