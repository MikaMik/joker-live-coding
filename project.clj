(defproject joker "0.1.0-SNAPSHOT"
  :description "live coding joker conf 2014"
  :url "https://github.com/niquola/joker-live-coding"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [http-kit "2.1.19"]
                 [hiccup "1.0.5"]
                 [garden "1.2.3"]
                 [compojure "1.1.9"]]
  :profiles
  {:dev {:dependencies [[im.chit/vinyasa "0.2.2"]
                        [javax.servlet/servlet-api "2.5"]]}})
