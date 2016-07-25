(defproject bikecommuter "1.0.0-SNAPSHOT"
  :description "a project to record my daily bike commute"
  :url "https://bikecommuterdrhm.herokuapp.com/"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [ring/ring-devel "1.2.2"]
                 [ring-basic-authentication "1.0.5"]
                 [environ "0.5.0"]
                 [com.cemerick/drawbridge "0.0.6"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]
            [lein-ring "0.8.0"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "bikecommuter-standalone.jar"
  :profiles {:production {:env {:production true}}}
  :ring {:handler bikecommuter.web/app}
  :main bikecommuter.web)


