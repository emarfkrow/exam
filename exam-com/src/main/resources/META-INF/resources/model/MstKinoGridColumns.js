/**
 * 機能マスタグリッド定義
 */

let MstKinoGridColumns = [
    Column.text('KINO_NM', Messages['MstKinoGrid.kinoNm'], 240, 'primaryKey', null),
    Column.text('KINO_MEI', Messages['MstKinoGrid.kinoMei'], 300, '', null),
    Column.date('KAISHI_BI', Messages['MstKinoGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MstKinoGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('INSERT_DT', Messages['MstKinoGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MstKinoGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MstKinoGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MstKinoGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MstKinoGrid.deleteF'], 30, ''),
];
