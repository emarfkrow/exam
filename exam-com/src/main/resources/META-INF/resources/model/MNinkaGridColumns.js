/**
 * 認可マスタグリッド定義
 */

let MNinkaGridColumns = [
    Column.refer('BUSHO_ID', Messages['MNinkaGrid.bushoId'], 150, 'primaryKey numbering', 'null'),
    Column.refer('SHOKUI_ID', Messages['MNinkaGrid.shokuiId'], 150, 'primaryKey numbering', 'null'),
    Column.text('GAMEN_NM', Messages['MNinkaGrid.gamenNm'], 300, 'primaryKey', null),
    Column.select('KENGEN_KB', Messages['MNinkaGrid.kengenKb'], 30, '', { json: 'MCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.date('KAISHI_YMD', Messages['MNinkaGrid.kaishiYmd'], 150, '', null),
    Column.date('SHURYO_YMD', Messages['MNinkaGrid.shuryoYmd'], 150, '', null),
    Column.cell('INSERT_DT', Messages['MNinkaGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MNinkaGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MNinkaGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MNinkaGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MNinkaGrid.deleteF'], 30, ''),
];
