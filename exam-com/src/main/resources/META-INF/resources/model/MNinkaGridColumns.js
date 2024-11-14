/**
 * 認可マスタグリッド定義
 */

let MNinkaGridColumns = [
    Column.refer('BUSHO_ID', Messages['MNinkaGrid.bushoId'], 150, 'primaryKey numbering', 'null'),
    Column.refer('SHOKUI_ID', Messages['MNinkaGrid.shokuiId'], 150, 'primaryKey numbering', 'null'),
    Column.refer('KINO_NM', Messages['MNinkaGrid.kinoNm'], 300, 'primaryKey', 'null'),
    Column.select('KENGEN_KB', Messages['MNinkaGrid.kengenKb'], 30, '', { json: 'MKbnValueSearch.json', paramkey: 'KBN_NM', value: 'KBN_KB', label: 'KBN_KB_MEI' }),
    Column.date('KAISHI_BI', Messages['MNinkaGrid.kaishiBi'], 150, '', Slick.Formatters.Extends.DateTime),
    Column.date('SHURYO_BI', Messages['MNinkaGrid.shuryoBi'], 150, '', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_DT', Messages['MNinkaGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MNinkaGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MNinkaGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MNinkaGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MNinkaGrid.deleteF'], 30, ''),
];
