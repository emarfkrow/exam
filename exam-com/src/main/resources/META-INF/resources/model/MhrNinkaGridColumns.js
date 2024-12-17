/**
 * 認可マスタグリッド定義
 */

let MhrNinkaGridColumns = [
    Column.refer('BUSHO_ID', Messages['MhrNinkaGrid.bushoId'], 80, 'primaryKey numbering', 'null'),
    Column.refer('SHOKUI_ID', Messages['MhrNinkaGrid.shokuiId'], 80, 'primaryKey numbering', 'null'),
    Column.refer('KINO_NM', Messages['MhrNinkaGrid.kinoNm'], 240, 'primaryKey', 'null'),
    Column.select('KENGEN_KB', Messages['MhrNinkaGrid.kengenKb'], 30, '', { json: 'MKbnValueSearch.json', paramkey: 'KBN_NM', value: 'KBN_KB', label: 'KBN_KB_MEI' }),
    Column.date('KAISHI_BI', Messages['MhrNinkaGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrNinkaGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('INSERT_DT', Messages['MhrNinkaGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MhrNinkaGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MhrNinkaGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MhrNinkaGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MhrNinkaGrid.deleteF'], 30, ''),
];
