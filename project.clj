(defproject todo-list "0.1.0-SNAPSHOT"
  :description "Simple app using Ring"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring                "1.7.1"]
                 [compojure "1.3.4"]
                 [hiccup "1.0.5"]]
  :repl-options {:init-ns todo-list.core}
  :main todo-list.core
  :min-lein-version "2.0.0"
  :uberjar-name "todo-list.jar"
  :profiles {:dev
             {:main todo-list.core/-dev-main}})
