;(function($){if((function(d){try{d.style.position="sticky"}catch(e){return false}
return d.style.position==="sticky"}(document.createElement("div"))))return
var uniqueID=0
function onscroll($el){var data=$el.data("position:sticky")
if(!data)return
if($(window).scrollTop()>=data.offsetTop- data.top){if(!data.$clone){data.$clone=$el.clone().css({position:"fixed",top:data.top}).appendTo("body")
$el.css("visibility","hidden")
onresize($el)}}
else{if(data.$clone){data.$clone.remove()
data.$clone=null
$el.css("visibility","visible")}}}
function onresize($el){var data=$el.data("position:sticky"),offset
if(data&&data.$clone){offset=$el.offset()
data.offsetTop=offset.top
data.$clone.css({left:offset.left,width:$el.width()})}}
function doMatched(rules){rules.each(function(rule){var $elements=$(rule.getSelectors()),declaration=rule.getDeclaration()
$elements.each(function(){var $this=$(this),data=$this.data("position:sticky")
if(!data){data={id:++uniqueID,offsetTop:$this.offset().top,top:parseInt(declaration.top,10)}
$this.data("position:sticky",data)}
onscroll($this)
$(window).on("scroll.position:sticky:"+ data.id,function(){onscroll($this)})
$(window).on("resize.position:sticky:"+ data.id,function(){onresize($this)})})})}
function undoUnmatched(rules){rules.each(function(rule){var $elements=$(rule.getSelectors())
$elements.each(function(){var $this=$(this),data=$(this).data("position:sticky")
if(data){if(data.$clone){data.$clone.remove()
$this.css("visibility","visible")}
$(window).off(".position:sticky:"+ data.id)
$this.removeData("position:sticky")}})})}
Polyfill({declarations:["position:sticky"]},{include:["position-sticky"]}).doMatched(doMatched).undoUnmatched(undoUnmatched)}(jQuery))