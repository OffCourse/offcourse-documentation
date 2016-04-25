(set-env!
 :source-paths    #{"source/clj-css"}
 :target #{"something/something"}
 :dependencies '[[org.martinklepsch/boot-garden "1.3.0-0"]
                 [prismatic/plumbing          "0.5.2"]])

(require
 '[org.martinklepsch.boot-garden :refer [garden]])

(deftask css []
  (set-env! 
    :source-paths #(conj % "source/clj-css")
    :target-path "something/something")
  (task-options! garden {:styles-var   'offcourse.styles.index/base
                         :vendors ["webkit" "moz"]
                         :auto-prefix #{:user-select :column-count :column-gap}
                         :output-to    "css/main.css"
                         :pretty-print true})
  (garden))