(defproject xyz.zcaudate/castor "0.1.0"
  :description "library to access the castor edc api"
  :url "https://github.com/zcaudate-xyz/castor"
  :license  {:name "MIT License"
             :url  "http://opensource.org/licenses/MIT"}
  :aliases
  {"test"  ["exec" "-ep" "(use 'code.test) (def res (run :all)) (System/exit (+ (:failed res) (:thrown res)))"]}
  
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.github.oliyh/martian         "0.1.26"]
                 [xyz.zcaudate/std.lib             "4.0.1"]
                 [xyz.zcaudate/std.text            "4.0.1"]
                 [xyz.zcaudate/std.html            "4.0.1"]
                 [xyz.zcaudate/std.json            "4.0.1"]]
  :profiles
  {:dev 
   {:plugins [[lein-exec "0.3.7"]
              [cider/cider-nrepl "0.45.0"]]
    :dependencies [[xyz.zcaudate/code.test           "4.0.1"]
                   [xyz.zcaudate/code.manage         "4.0.1"]
                   [xyz.zcaudate/code.java           "4.0.1"]
                   [xyz.zcaudate/code.maven          "4.0.1"]
                   [xyz.zcaudate/code.doc            "4.0.1"]
                   [xyz.zcaudate/code.dev            "4.0.1"]]}}
  :deploy-repositories [["clojars"
                         {:url  "https://clojars.org/repo"
                          :sign-releases false}]])
