let i = 0
const checkInterval = setInterval(()=>{
	i += 1
	console.log(i)
	if(i === 3) clearInterval(checkInterval)
}, 1000)